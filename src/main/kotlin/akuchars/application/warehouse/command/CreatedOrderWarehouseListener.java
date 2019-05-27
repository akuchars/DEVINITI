package akuchars.application.warehouse.command;

import akuchars.domain.store.event.CreatedOrderEvent;
import akuchars.domain.store.model.Order;
import akuchars.domain.store.model.OrderItem;
import akuchars.domain.store.model.OrderItemsAmount;
import akuchars.domain.store.model.Product;
import akuchars.domain.store.repository.OrderRepository;
import akuchars.domain.warehouse.ProductAddress;
import akuchars.domain.warehouse.ProductAddressRepository;
import akuchars.domain.warehouse.QProductAddress;
import kotlin.jvm.internal.Intrinsics;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CreatedOrderWarehouseListener implements ApplicationListener<CreatedOrderEvent> {

    private static final QProductAddress e = QProductAddress.productAddress;

    private final OrderRepository orderRepository;
    private final ProductAddressRepository productAddressRepository;

    public CreatedOrderWarehouseListener(OrderRepository orderRepository, ProductAddressRepository productAddressRepository) {
        Intrinsics.checkParameterIsNotNull(orderRepository, "orderRepository");
        Intrinsics.checkParameterIsNotNull(productAddressRepository, "productAddressRepository");
        this.orderRepository = orderRepository;
        this.productAddressRepository = productAddressRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(CreatedOrderEvent event) {
        Order order = orderRepository.findById(event.getOrderId()).get();
        List<ProductAddress> products = order.getItems().stream()
                .map(OrderItem::getProduct)
                .map(Product::getId)
                .map(productId -> productAddressRepository.findOne(e.product.id.eq(productId)))
                .map(Optional::get)
                .map(it -> it.decreaseProductAmount(findAmountToDecrease(order, it))).collect(Collectors.toList());

        productAddressRepository.saveAll(products);
    }

    private long findAmountToDecrease(Order order, ProductAddress it) {
        return order.getItems().stream()
                .filter(item -> item.getProduct().getId().equals(it.getProduct().getId()))
                .findFirst().map(OrderItem::getAmount)
                .map(OrderItemsAmount::getAmount)
                .orElse(0L);
    }
}

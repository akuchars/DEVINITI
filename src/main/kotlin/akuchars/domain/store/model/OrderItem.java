package akuchars.domain.store.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import akuchars.domain.common.AbstractJpaEntity;
import akuchars.kernel.ApplicationProperties;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Table(schema = ApplicationProperties.STORE_SCHEMA_NAME, name = "order_items")
public class OrderItem extends AbstractJpaEntity {
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Embedded
    private OrderItemsAmount amount;

    @ManyToOne
    @JoinColumn(
            name = "order_id"
    )
    private Order order;

    public OrderItem(Product product, OrderItemsAmount amount) {
        Intrinsics.checkParameterIsNotNull(product, "product");
        Intrinsics.checkParameterIsNotNull(amount, "amount");
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public OrderItemsAmount getAmount() {
        return amount;
    }

    public Order getOrder() {
        return order;
    }
}

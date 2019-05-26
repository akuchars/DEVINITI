package akuchars.infrastructure.warehouse;

import akuchars.application.warehouse.model.*;
import akuchars.application.warehouse.query.ProductQueryService;
import akuchars.domain.store.model.ProductStatus;
import akuchars.domain.warehouse.ProductAddress;
import akuchars.domain.warehouse.ProductAddressRepository;
import akuchars.domain.warehouse.QProductAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductQueryServiceImpl implements ProductQueryService {

    private final ProductAddressRepository productAddressRepository;

    private static final QProductAddress e = QProductAddress.productAddress;

    public ProductQueryServiceImpl(ProductAddressRepository productAddressRepository) {
        Intrinsics.checkParameterIsNotNull(productAddressRepository, "productAddressRepository");
        this.productAddressRepository = productAddressRepository;
    }

    @NotNull
    @Override
    @Transactional(readOnly = true)
    public ProductsDto findProductsByName(@NotNull String productName) {
        Collection<ProductAddress> products = (Collection<ProductAddress>) productAddressRepository
                .findAll(e.product.name.value.eq(productName));

        List<ProductDto> productsList = products.stream()
                .map(this::mapToDto).collect(Collectors.toList());
        return new ProductsDto(productsList);
    }

    @NotNull
    @Override
    @Transactional(readOnly = true)
    public Page<ProductDto> findProductReadyToBuy(@NotNull Pageable pageable) {
        return productAddressRepository
                .findAll(e.product.status.eq(ProductStatus.TO_BUY), pageable)
                .map(this::mapToDto);
    }

    @NotNull
    private ProductDto mapToDto(ProductAddress it) {
        return new ProductDto(
                new ProductDataDto(
                        it.getId(),
                        it.getProduct().getName().getValue(),
                        ProductColorDtoKt.toDto(it.getProduct().getColor()),
                        it.getProduct().getPrice().getValue()
                ),
                new ProductLocalizationDto(
                        it.getStreet().getId(),
                        it.getStillage().getId(),
                        it.getShelf().getId()
                ),
                ProductDtoKt.toDto(it.getProduct().getStatus()
                )
        );
    }

}

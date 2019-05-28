package akuchars.application.warehouse.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lakuchars/application/warehouse/query/ProductQueryService;", "", "getAmountOfProduct", "", "productId", "getProductById", "Lakuchars/application/warehouse/model/ProductDto;", "getProductReadyToBuy", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getProductsByName", "Lakuchars/application/warehouse/model/ProductsDto;", "productName", "", "devinity"})
public abstract interface ProductQueryService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract akuchars.application.warehouse.model.ProductsDto getProductsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String productName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract akuchars.application.warehouse.model.ProductDto getProductById(long productId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.data.domain.Page<akuchars.application.warehouse.model.ProductDto> getProductReadyToBuy(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    public abstract long getAmountOfProduct(long productId);
}
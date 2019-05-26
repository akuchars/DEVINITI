package akuchars.application.warehouse.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lakuchars/application/warehouse/query/ProductQueryService;", "", "findProductReadyToBuy", "Lorg/springframework/data/domain/Page;", "Lakuchars/application/warehouse/model/ProductDto;", "pageable", "Lorg/springframework/data/domain/Pageable;", "findProductsByName", "Lakuchars/application/warehouse/model/ProductsDto;", "productName", "", "devinity"})
public abstract interface ProductQueryService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract akuchars.application.warehouse.model.ProductsDto findProductsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String productName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.data.domain.Page<akuchars.application.warehouse.model.ProductDto> findProductReadyToBuy(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
}
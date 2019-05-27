package akuchars.ui.warehouse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0017J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lakuchars/ui/warehouse/ProductRestController;", "", "warehouseService", "Lakuchars/application/warehouse/command/WarehouseService;", "productQueryService", "Lakuchars/application/warehouse/query/ProductQueryService;", "(Lakuchars/application/warehouse/command/WarehouseService;Lakuchars/application/warehouse/query/ProductQueryService;)V", "getAvailableProduct", "Lorg/springframework/data/domain/Page;", "Lakuchars/ui/rest/dto/ProductRestDto;", "page", "", "size", "getProductsByName", "Lakuchars/ui/rest/dto/ProductsRestDto;", "productName", "", "markToBuy", "Lakuchars/ui/rest/dto/ProductDataRestDto;", "productId", "", "amount", "Ljava/math/BigDecimal;", "devinity"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/warehouse/products"})
@org.springframework.web.bind.annotation.RestController()
public class ProductRestController {
    private final akuchars.application.warehouse.command.WarehouseService warehouseService = null;
    private final akuchars.application.warehouse.query.ProductQueryService productQueryService = null;
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/{productId}/markToBuy"})
    public akuchars.ui.rest.dto.ProductDataRestDto markToBuy(@org.springframework.web.bind.annotation.PathVariable()
    long productId, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.math.BigDecimal amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{productName}"})
    @org.springframework.web.bind.annotation.ResponseBody()
    public akuchars.ui.rest.dto.ProductsRestDto getProductsByName(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable()
    java.lang.String productName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/available"})
    public org.springframework.data.domain.Page<akuchars.ui.rest.dto.ProductRestDto> getAvailableProduct(@org.springframework.web.bind.annotation.RequestParam(defaultValue = "0")
    int page, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "500")
    int size) {
        return null;
    }
    
    public ProductRestController(@org.jetbrains.annotations.NotNull()
    akuchars.application.warehouse.command.WarehouseService warehouseService, @org.jetbrains.annotations.NotNull()
    akuchars.application.warehouse.query.ProductQueryService productQueryService) {
        super();
    }
}
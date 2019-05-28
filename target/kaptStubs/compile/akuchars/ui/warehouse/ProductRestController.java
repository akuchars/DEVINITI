package akuchars.ui.warehouse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0017J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0017J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lakuchars/ui/warehouse/ProductRestController;", "", "warehouseService", "Lakuchars/application/warehouse/command/WarehouseService;", "productQueryService", "Lakuchars/application/warehouse/query/ProductQueryService;", "(Lakuchars/application/warehouse/command/WarehouseService;Lakuchars/application/warehouse/query/ProductQueryService;)V", "addProductToWarehouse", "Lakuchars/ui/rest/dto/ProductRestDto;", "productCreatorRestDto", "Lakuchars/ui/rest/dto/ProductCreatorRestDto;", "getAvailableProduct", "Lorg/springframework/data/domain/Page;", "page", "", "size", "getProductsByName", "Lakuchars/ui/rest/dto/ProductsRestDto;", "productName", "", "markToBuy", "Lakuchars/ui/rest/dto/ProductDataRestDto;", "productId", "", "amount", "Ljava/math/BigDecimal;", "devinity"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/warehouse/products"})
@org.springframework.web.bind.annotation.RestController()
public class ProductRestController {
    private final akuchars.application.warehouse.command.WarehouseService warehouseService = null;
    private final akuchars.application.warehouse.query.ProductQueryService productQueryService = null;
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/{productId}/markToBuy"})
    @io.swagger.annotations.ApiImplicitParams(value = {@io.swagger.annotations.ApiImplicitParam(dataType = "long", paramType = "path", required = true, value = "Product id", name = "productId"), @io.swagger.annotations.ApiImplicitParam(dataType = "long", paramType = "query", required = true, value = "Amount to sale product", name = "amount")})
    @io.swagger.annotations.ApiOperation(value = "Mark product ready to be buy")
    public akuchars.ui.rest.dto.ProductDataRestDto markToBuy(@org.springframework.web.bind.annotation.PathVariable()
    long productId, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.math.BigDecimal amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{productName}"})
    @org.springframework.web.bind.annotation.ResponseBody()
    @io.swagger.annotations.ApiImplicitParams(value = {@io.swagger.annotations.ApiImplicitParam(dataType = "string", paramType = "path", required = true, value = "Product id", name = "productName")})
    @io.swagger.annotations.ApiOperation(value = "Get products for given name")
    public akuchars.ui.rest.dto.ProductsRestDto getProductsByName(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable()
    java.lang.String productName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/create"})
    @org.springframework.web.bind.annotation.ResponseBody()
    @io.swagger.annotations.ApiImplicitParams(value = {@io.swagger.annotations.ApiImplicitParam(dataTypeClass = akuchars.ui.rest.dto.ProductCreatorRestDto.class, paramType = "body", required = true, value = "Product data with localization", name = "productCreatorRestDto")})
    @io.swagger.annotations.ApiOperation(value = "Create product and add to warehouse")
    public akuchars.ui.rest.dto.ProductRestDto addProductToWarehouse(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    akuchars.ui.rest.dto.ProductCreatorRestDto productCreatorRestDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/available"})
    @io.swagger.annotations.ApiImplicitParams(value = {@io.swagger.annotations.ApiImplicitParam(dataType = "long", paramType = "query", required = false, value = "Actual page", defaultValue = "0", name = "page"), @io.swagger.annotations.ApiImplicitParam(dataType = "long", paramType = "query", required = false, value = "Maximum items on page", defaultValue = "500", name = "size")})
    @io.swagger.annotations.ApiOperation(value = "Get available to buy products")
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
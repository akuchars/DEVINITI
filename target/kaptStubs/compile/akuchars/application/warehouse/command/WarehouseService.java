package akuchars.application.warehouse.command;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0017R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lakuchars/application/warehouse/command/WarehouseService;", "", "productRepository", "Lakuchars/domain/store/repository/ProductRepository;", "productQueryService", "Lakuchars/application/warehouse/query/ProductQueryService;", "warehouseFactory", "Lakuchars/domain/warehouse/WarehouseFactory;", "streetRepository", "Lakuchars/domain/warehouse/StreetRepository;", "stillageRepository", "Lakuchars/domain/warehouse/StillageRepository;", "shelfRepository", "Lakuchars/domain/warehouse/ShelfRepository;", "applicationEventPublisher", "Lorg/springframework/context/ApplicationEventPublisher;", "(Lakuchars/domain/store/repository/ProductRepository;Lakuchars/application/warehouse/query/ProductQueryService;Lakuchars/domain/warehouse/WarehouseFactory;Lakuchars/domain/warehouse/StreetRepository;Lakuchars/domain/warehouse/StillageRepository;Lakuchars/domain/warehouse/ShelfRepository;Lorg/springframework/context/ApplicationEventPublisher;)V", "addNewProductToWarehouse", "Lakuchars/application/warehouse/model/ProductDto;", "productDto", "Lakuchars/application/warehouse/model/ProductDataDto;", "productLocalization", "Lakuchars/application/warehouse/model/ProductLocalizationDto;", "amount", "", "createProductAddress", "", "product", "Lakuchars/domain/store/model/Product;", "markProductAsToBuy", "productId", "price", "Ljava/math/BigDecimal;", "devinity"})
@org.springframework.stereotype.Service()
public class WarehouseService {
    private final akuchars.domain.store.repository.ProductRepository productRepository = null;
    private final akuchars.application.warehouse.query.ProductQueryService productQueryService = null;
    private final akuchars.domain.warehouse.WarehouseFactory warehouseFactory = null;
    private final akuchars.domain.warehouse.StreetRepository streetRepository = null;
    private final akuchars.domain.warehouse.StillageRepository stillageRepository = null;
    private final akuchars.domain.warehouse.ShelfRepository shelfRepository = null;
    private final org.springframework.context.ApplicationEventPublisher applicationEventPublisher = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public akuchars.application.warehouse.model.ProductDto addNewProductToWarehouse(@org.jetbrains.annotations.NotNull()
    akuchars.application.warehouse.model.ProductDataDto productDto, @org.jetbrains.annotations.NotNull()
    akuchars.application.warehouse.model.ProductLocalizationDto productLocalization, long amount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.transaction.annotation.Transactional()
    public akuchars.application.warehouse.model.ProductDataDto markProductAsToBuy(long productId, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal price) {
        return null;
    }
    
    private void createProductAddress(akuchars.domain.store.model.Product product, akuchars.application.warehouse.model.ProductLocalizationDto productLocalization, long amount) {
    }
    
    public WarehouseService(@org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull()
    akuchars.application.warehouse.query.ProductQueryService productQueryService, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.WarehouseFactory warehouseFactory, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.StreetRepository streetRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.StillageRepository stillageRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.ShelfRepository shelfRepository, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
        super();
    }
}
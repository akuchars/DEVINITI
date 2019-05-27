package akuchars.infrastructure.spring;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lakuchars/infrastructure/spring/InitDatabaseRunner;", "Lorg/springframework/boot/ApplicationRunner;", "productRepository", "Lakuchars/domain/store/repository/ProductRepository;", "streetRepository", "Lakuchars/domain/warehouse/StreetRepository;", "stillageRepository", "Lakuchars/domain/warehouse/StillageRepository;", "shelfRepository", "Lakuchars/domain/warehouse/ShelfRepository;", "productAddressRepository", "Lakuchars/domain/warehouse/ProductAddressRepository;", "clientAddressRepository", "Lakuchars/domain/store/repository/ClientAddressRepository;", "clientRepository", "Lakuchars/domain/store/repository/ClientRepository;", "applicationEventPublisher", "Lorg/springframework/context/ApplicationEventPublisher;", "(Lakuchars/domain/store/repository/ProductRepository;Lakuchars/domain/warehouse/StreetRepository;Lakuchars/domain/warehouse/StillageRepository;Lakuchars/domain/warehouse/ShelfRepository;Lakuchars/domain/warehouse/ProductAddressRepository;Lakuchars/domain/store/repository/ClientAddressRepository;Lakuchars/domain/store/repository/ClientRepository;Lorg/springframework/context/ApplicationEventPublisher;)V", "generateProductName", "Lakuchars/domain/store/model/ProductName;", "productIndex", "", "run", "", "args", "Lorg/springframework/boot/ApplicationArguments;", "devinity"})
@org.springframework.stereotype.Component()
public class InitDatabaseRunner implements org.springframework.boot.ApplicationRunner {
    private final akuchars.domain.store.repository.ProductRepository productRepository = null;
    private final akuchars.domain.warehouse.StreetRepository streetRepository = null;
    private final akuchars.domain.warehouse.StillageRepository stillageRepository = null;
    private final akuchars.domain.warehouse.ShelfRepository shelfRepository = null;
    private final akuchars.domain.warehouse.ProductAddressRepository productAddressRepository = null;
    private final akuchars.domain.store.repository.ClientAddressRepository clientAddressRepository = null;
    private final akuchars.domain.store.repository.ClientRepository clientRepository = null;
    private final org.springframework.context.ApplicationEventPublisher applicationEventPublisher = null;
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    org.springframework.boot.ApplicationArguments args) {
    }
    
    private akuchars.domain.store.model.ProductName generateProductName(int productIndex) {
        return null;
    }
    
    public InitDatabaseRunner(@org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.StreetRepository streetRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.StillageRepository stillageRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.ShelfRepository shelfRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.ProductAddressRepository productAddressRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.ClientAddressRepository clientAddressRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
        super();
    }
}
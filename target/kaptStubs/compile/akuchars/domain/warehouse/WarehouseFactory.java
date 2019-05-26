package akuchars.domain.warehouse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lakuchars/domain/warehouse/WarehouseFactory;", "", "domainEventBus", "Lakuchars/domain/DomainEventBus;", "productAddressRepository", "Lakuchars/domain/warehouse/ProductAddressRepository;", "(Lakuchars/domain/DomainEventBus;Lakuchars/domain/warehouse/ProductAddressRepository;)V", "createProductAddress", "", "product", "Lakuchars/domain/store/model/Product;", "street", "Lakuchars/domain/warehouse/Street;", "stillage", "Lakuchars/domain/warehouse/Stillage;", "shelf", "Lakuchars/domain/warehouse/Shelf;", "amount", "", "devinity"})
@org.springframework.stereotype.Service()
public class WarehouseFactory {
    private final akuchars.domain.DomainEventBus domainEventBus = null;
    private final akuchars.domain.warehouse.ProductAddressRepository productAddressRepository = null;
    
    public void createProductAddress(@org.jetbrains.annotations.NotNull()
    akuchars.domain.store.model.Product product, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.Street street, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.Stillage stillage, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.Shelf shelf, long amount) {
    }
    
    public WarehouseFactory(@org.jetbrains.annotations.NotNull()
    akuchars.domain.DomainEventBus domainEventBus, @org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.ProductAddressRepository productAddressRepository) {
        super();
    }
}
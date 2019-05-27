package akuchars.infrastructure.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0012J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lakuchars/infrastructure/store/CreateOrderValidatorImpl;", "Lakuchars/domain/store/repository/CreateOrderValidator;", "productAddressRepository", "Lakuchars/domain/warehouse/ProductAddressRepository;", "(Lakuchars/domain/warehouse/ProductAddressRepository;)V", "isProductAvailableInWarehouse", "", "it", "Lakuchars/domain/store/model/OrderItem;", "validateThatOrderCanBeComplex", "order", "Lakuchars/domain/store/model/Order;", "devinity"})
@org.springframework.stereotype.Component()
public class CreateOrderValidatorImpl implements akuchars.domain.store.repository.CreateOrderValidator {
    private final akuchars.domain.warehouse.ProductAddressRepository productAddressRepository = null;
    
    @java.lang.Override()
    public boolean validateThatOrderCanBeComplex(@org.jetbrains.annotations.NotNull()
    akuchars.domain.store.model.Order order) {
        return false;
    }
    
    private boolean isProductAvailableInWarehouse(akuchars.domain.store.model.OrderItem it) {
        return false;
    }
    
    public CreateOrderValidatorImpl(@org.jetbrains.annotations.NotNull()
    akuchars.domain.warehouse.ProductAddressRepository productAddressRepository) {
        super();
    }
}
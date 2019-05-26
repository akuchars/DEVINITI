package akuchars.infrastructure.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lakuchars/infrastructure/store/CreateOrderValidatorImpl;", "Lakuchars/domain/store/repository/CreateOrderValidator;", "()V", "validateThatOrderCanBeComplex", "", "order", "Lakuchars/domain/store/model/Order;", "devinity"})
@org.springframework.stereotype.Component()
public class CreateOrderValidatorImpl implements akuchars.domain.store.repository.CreateOrderValidator {
    
    @java.lang.Override()
    public boolean validateThatOrderCanBeComplex(@org.jetbrains.annotations.NotNull()
    akuchars.domain.store.model.Order order) {
        return false;
    }
    
    public CreateOrderValidatorImpl() {
        super();
    }
}
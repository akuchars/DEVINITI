package akuchars.application.store.command;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0012J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lakuchars/application/store/command/OrderService;", "", "orderRepository", "Lakuchars/domain/store/repository/OrderRepository;", "clientRepository", "Lakuchars/domain/store/repository/ClientRepository;", "productRepository", "Lakuchars/domain/store/repository/ProductRepository;", "domainEventBus", "Lakuchars/domain/DomainEventBus;", "createOrderValidator", "Lakuchars/domain/store/repository/CreateOrderValidator;", "(Lakuchars/domain/store/repository/OrderRepository;Lakuchars/domain/store/repository/ClientRepository;Lakuchars/domain/store/repository/ProductRepository;Lakuchars/domain/DomainEventBus;Lakuchars/domain/store/repository/CreateOrderValidator;)V", "buildOrderItems", "", "Lakuchars/domain/store/model/OrderItem;", "orderDto", "Lakuchars/application/store/model/OrderDto;", "createNewOrder", "", "clientId", "", "devinity"})
@org.springframework.stereotype.Component()
public class OrderService {
    private final akuchars.domain.store.repository.OrderRepository orderRepository = null;
    private final akuchars.domain.store.repository.ClientRepository clientRepository = null;
    private final akuchars.domain.store.repository.ProductRepository productRepository = null;
    private final akuchars.domain.DomainEventBus domainEventBus = null;
    private final akuchars.domain.store.repository.CreateOrderValidator createOrderValidator = null;
    
    @org.springframework.transaction.annotation.Transactional()
    public void createNewOrder(long clientId, @org.jetbrains.annotations.NotNull()
    akuchars.application.store.model.OrderDto orderDto) {
    }
    
    private java.util.List<akuchars.domain.store.model.OrderItem> buildOrderItems(akuchars.application.store.model.OrderDto orderDto) {
        return null;
    }
    
    public OrderService(@org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.OrderRepository orderRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull()
    akuchars.domain.DomainEventBus domainEventBus, @org.jetbrains.annotations.NotNull()
    akuchars.domain.store.repository.CreateOrderValidator createOrderValidator) {
        super();
    }
}
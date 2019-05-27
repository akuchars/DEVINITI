package akuchars.domain.store.model;

import akuchars.domain.AbstractJpaEntity;
import akuchars.domain.store.event.CreatedOrderEvent;
import akuchars.domain.store.repository.CreateOrderValidator;
import kotlin.jvm.internal.Intrinsics;
import org.springframework.context.ApplicationEventPublisher;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "store", name = "orders")
public class Order extends AbstractJpaEntity {
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(
            mappedBy = "order",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    private List<OrderItem> items;

    Order() {
    }

    public Order(Client client, List<OrderItem> items) {
        Intrinsics.checkParameterIsNotNull(client, "client");
        Intrinsics.checkParameterIsNotNull(items, "items");
        this.client = client;
        this.items = items;
    }

    public Order makeOrder(ApplicationEventPublisher applicationEventPublisher,
                           CreateOrderValidator createOrderValidator) {
        Intrinsics.checkParameterIsNotNull(applicationEventPublisher, "applicationEventPublisher");
        Intrinsics.checkParameterIsNotNull(createOrderValidator, "createOrderValidator");
        if (createOrderValidator.validateThatOrderCanBeComplex(this)) {
            applicationEventPublisher.publishEvent(new CreatedOrderEvent(id, this));
            return this;
        }
        throw new OrderCannotBeComplex(this);
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}

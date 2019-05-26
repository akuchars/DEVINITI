package akuchars.domain.store.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lakuchars/domain/store/event/CreatedOrderEvent;", "Lorg/springframework/context/ApplicationEvent;", "Lakuchars/domain/DomainEvent;", "orderId", "", "source", "", "(JLjava/lang/Object;)V", "getOrderId", "()J", "devinity"})
public final class CreatedOrderEvent extends org.springframework.context.ApplicationEvent implements akuchars.domain.DomainEvent {
    private final long orderId = 0L;
    
    public final long getOrderId() {
        return 0L;
    }
    
    public CreatedOrderEvent(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.Object source) {
        super(null);
    }
}
package akuchars.infrastructure.spring;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lakuchars/infrastructure/spring/DomainEventBusImpl;", "Lakuchars/domain/DomainEventBus;", "applicationEventPublisher", "Lorg/springframework/context/ApplicationEventPublisher;", "(Lorg/springframework/context/ApplicationEventPublisher;)V", "publish", "", "event", "Lakuchars/domain/DomainEvent;", "devinity"})
@org.springframework.stereotype.Service()
public class DomainEventBusImpl implements akuchars.domain.DomainEventBus {
    private final org.springframework.context.ApplicationEventPublisher applicationEventPublisher = null;
    
    @java.lang.Override()
    public void publish(@org.jetbrains.annotations.NotNull()
    akuchars.domain.DomainEvent event) {
    }
    
    public DomainEventBusImpl(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
        super();
    }
}
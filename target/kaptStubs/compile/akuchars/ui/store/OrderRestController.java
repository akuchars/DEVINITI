package akuchars.ui.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lakuchars/ui/store/OrderRestController;", "", "orderService", "Lakuchars/application/store/command/OrderService;", "(Lakuchars/application/store/command/OrderService;)V", "createNewOrder", "", "clientId", "", "orderRestDto", "Lakuchars/ui/rest/dto/OrderRestDto;", "devinity"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/store/orders"})
@org.springframework.web.bind.annotation.RestController()
public class OrderRestController {
    private final akuchars.application.store.command.OrderService orderService = null;
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/create"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    public void createNewOrder(@org.springframework.web.bind.annotation.RequestParam()
    long clientId, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    akuchars.ui.rest.dto.OrderRestDto orderRestDto) {
    }
    
    public OrderRestController(@org.jetbrains.annotations.NotNull()
    akuchars.application.store.command.OrderService orderService) {
        super();
    }
}
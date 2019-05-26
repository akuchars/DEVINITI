package akuchars.ui.store

import akuchars.application.store.command.OrderService
import akuchars.application.store.model.OrderDto
import akuchars.ui.rest.dto.OrderRestDto
import akuchars.ui.rest.dto.toDto
import akuchars.ui.rest.dto.toRestDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/store/orders")
class OrderRestController(
        private val orderService: OrderService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/create")
    fun createNewOrder(@RequestParam clientId: Long, @RequestBody orderRestDto: OrderRestDto): OrderRestDto {
        return orderService.createNewOrder(clientId, orderRestDto.toDto()).toRestDto()
    }
}

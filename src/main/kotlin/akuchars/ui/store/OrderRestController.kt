package akuchars.ui.store

import akuchars.application.store.command.OrderService
import akuchars.ui.rest.dto.OrderRestDto
import akuchars.ui.rest.dto.toDto
import akuchars.ui.rest.dto.toRestDto
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiImplicitParams
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/store/orders")
class OrderRestController(
	private val orderService: OrderService
) {

	@ApiOperation("Create new order")
	@ApiImplicitParams(
		ApiImplicitParam(name = "clientId", value = "Client id", required = true, dataType = "long", paramType = "query"),
		ApiImplicitParam(name = "orderRestDto", value = "Order to submit", required = true, dataTypeClass = OrderRestDto::class, paramType = "body")
	)
	@ResponseStatus(HttpStatus.CREATED)
	@PutMapping("/create")
	fun createNewOrder(@RequestParam clientId: Long, @RequestBody orderRestDto: OrderRestDto): OrderRestDto {
		return orderService.createNewOrder(clientId, orderRestDto.toDto()).toRestDto()
	}
}

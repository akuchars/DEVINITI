package akuchars.application.store.model

class OrderDto(
	val id: Long? = null,
	val orderItemDto: List<OrderItemDto> = listOf()
)
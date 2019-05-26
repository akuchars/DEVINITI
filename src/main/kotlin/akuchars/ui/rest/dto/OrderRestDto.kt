package akuchars.ui.rest.dto

class OrderRestDto(
        val orderItemDto: List<OrderItemRestDto> = listOf()
)

class OrderItemRestDto(
        val productId: Long? = null,
        val amount: Long? = null
)
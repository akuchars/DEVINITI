package akuchars.application.store.command

import akuchars.application.store.model.OrderDto
import akuchars.application.store.model.OrderItemDto
import akuchars.domain.store.model.Order
import akuchars.domain.store.model.OrderItem
import akuchars.domain.store.model.OrderItemsAmount
import akuchars.domain.store.repository.ClientRepository
import akuchars.domain.store.repository.CreateOrderValidator
import akuchars.domain.store.repository.OrderRepository
import akuchars.domain.store.repository.ProductRepository
import org.springframework.context.ApplicationEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityNotFoundException

@Component
class OrderService(
        private val orderRepository: OrderRepository,
        private val clientRepository: ClientRepository,
        private val productRepository: ProductRepository,
        private val applicationEventPublisher: ApplicationEventPublisher,
        private val createOrderValidator: CreateOrderValidator
) {

    @Transactional
    fun createNewOrder(clientId: Long, orderDto: OrderDto): OrderDto {
        val client = clientRepository.findById(clientId).orElseThrow(::EntityNotFoundException)
        return Order(client, buildOrderItems(orderDto)).apply {
            orderRepository.save(this)
            makeOrder(applicationEventPublisher, createOrderValidator)
        }.let { OrderDto(it.items.map { orderItem -> OrderItemDto(orderItem.product.id!!, orderItem.amount.amount) }) }
    }

    private fun buildOrderItems(orderDto: OrderDto): List<OrderItem> {
        return orderDto.orderItemDto.map {
            val product = productRepository.findById(it.productId).orElseThrow(::EntityNotFoundException)
            OrderItem(product, OrderItemsAmount(it.amount))
        }
    }
}
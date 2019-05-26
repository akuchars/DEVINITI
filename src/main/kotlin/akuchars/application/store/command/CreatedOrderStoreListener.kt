package akuchars.application.store.command

import akuchars.domain.store.event.CreatedOrderEvent
import akuchars.domain.store.model.Order
import akuchars.domain.store.repository.OrderRepository
import akuchars.domain.store.repository.ProductRepository
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class CreatedOrderStoreListener (
        private val orderRepository: OrderRepository,
        private val productRepository: ProductRepository
): ApplicationListener<CreatedOrderEvent> {

    override fun onApplicationEvent(event: CreatedOrderEvent) {
        val order = orderRepository.findById(event.orderId).get()
        markProductsAsSold(order)
    }

    private fun markProductsAsSold(order: Order) {
        order.items.map { item -> item.product }
                .map { it.markAsSold() }
                .forEach { productRepository.save(it) }
    }
}
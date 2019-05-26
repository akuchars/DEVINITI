package akuchars.infrastructure.store

import akuchars.domain.store.model.Order
import akuchars.domain.store.model.OrderItem
import akuchars.domain.store.repository.CreateOrderValidator
import akuchars.domain.warehouse.ProductAddressRepository
import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class CreateOrderValidatorImpl (private val productAddressRepository: ProductAddressRepository): CreateOrderValidator {

    //todo tutaj również można zwrócić jakiś obiekt zamiast Boolean, który przetrzymywałby errory
    override fun validateThatOrderCanBeComplex(order: Order): Boolean {
        order.items.forEach {
            if (it.product.isReadyToBuy.not())
                throw ProductIsNotReadyToBuyException(it.product.id!!)
            if (isProductAvailableInWarehouse(it).not())
                throw ProductNotInWarehouseException(it.product.id!!)
        }
        return true
    }

    private fun isProductAvailableInWarehouse(it: OrderItem) =
            productAddressRepository.findById(it.product.id!!).get().productAmount.amount >= it.amount.amount
}

class ProductIsNotReadyToBuyException(val id: Long): RuntimeException("Product by id $id is not ready to buy")
class ProductNotInWarehouseException(val id: Long): RuntimeException("Product by id $id not in warehouse")
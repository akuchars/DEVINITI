package akuchars.domain.warehouse

import akuchars.domain.store.model.Product
import akuchars.domain.warehouse.event.AddedProductToWarehouse
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class WarehouseFactory(
        private val applicationEventPublisher: ApplicationEventPublisher,
        private val productAddressRepository: ProductAddressRepository
) {

    fun createProductAddress(product: Product, street: Street, stillage: Stillage,  shelf: Shelf, amount: Long) {
        val productAddress = ProductAddress(product, street, stillage, shelf, ProductAmount(amount))
        val id = productAddressRepository.save(productAddress).id
        applicationEventPublisher.publishEvent(AddedProductToWarehouse(id!!, this))
    }
}
package akuchars.application.warehouse.command

import akuchars.application.warehouse.model.ProductDataDto
import akuchars.application.warehouse.model.ProductLocalizationDto
import akuchars.application.warehouse.model.toDto
import akuchars.application.warehouse.model.toEntity
import akuchars.domain.store.model.Price
import akuchars.domain.store.model.Product
import akuchars.domain.store.model.ProductName
import akuchars.domain.store.repository.ProductRepository
import akuchars.domain.warehouse.ShelfRepository
import akuchars.domain.warehouse.StillageRepository
import akuchars.domain.warehouse.StreetRepository
import akuchars.domain.warehouse.WarehouseFactory
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal
import javax.persistence.EntityNotFoundException

@Service
class WarehouseService(
        private val productRepository: ProductRepository,
        private val warehouseFactory: WarehouseFactory,
        private val streetRepository: StreetRepository,
        private val stillageRepository: StillageRepository,
        private val shelfRepository: ShelfRepository,
        private val applicationEventPublisher: ApplicationEventPublisher
) {

    @Transactional
    fun addNewProductToWarehouse(productDto: ProductDataDto, productLocalization: ProductLocalizationDto, amount: Long): Long {
        val product = Product(ProductName(productDto.name), productDto.colorDto.toEntity(), Price(productDto.price))
        val productId = productRepository.save(product).id
        createProductAddress(product, productLocalization, amount)
        return productId
    }

    @Transactional
    fun markProductAsToBuy(productId: Long, price: BigDecimal): ProductDataDto? {
        return productRepository.findById(productId)
                .map { it.markToBuy(applicationEventPublisher, price) }
                .map { productRepository.save(it) }
                .map { ProductDataDto(it.id, it.name.value, it.color.toDto(), it.price.value) }
                .orElse(null)
    }

    private fun createProductAddress(product: Product, productLocalization: ProductLocalizationDto, amount: Long) {
        warehouseFactory.createProductAddress(
                product,
                streetRepository.findById(productLocalization.streetId).orElseThrow(::EntityNotFoundException),
                stillageRepository.findById(productLocalization.stillageId).orElseThrow(::EntityNotFoundException),
                shelfRepository.findById(productLocalization.shelfId).orElseThrow(::EntityNotFoundException),
                amount
        )
    }
}
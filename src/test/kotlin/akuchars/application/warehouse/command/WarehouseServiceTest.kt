package akuchars.application.warehouse.command

import akuchars.application.warehouse.model.ProductColorDto.BLACK
import akuchars.application.warehouse.model.ProductDataDto
import akuchars.application.warehouse.model.ProductLocalizationDto
import akuchars.domain.store.model.ProductStatus.TO_BUY
import akuchars.domain.store.repository.ProductRepository
import akuchars.domain.warehouse.ProductAddressRepository
import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isGreaterThan
import assertk.assertions.isNotNull
import assertk.assertions.isNull
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class WarehouseServiceTest {

	@Autowired
	private lateinit var warehouseService: WarehouseService

	@Autowired
	private lateinit var productAddressRepository: ProductAddressRepository

	@Autowired
	private lateinit var productRepository: ProductRepository

	@Test
	internal fun `should add new product to warehouse`() {
		//given
		val sizeBeforeAdding = productAddressRepository.count()

		//when
		val productId = warehouseService.addNewProductToWarehouse(
			ProductDataDto(name = "some extra name", colorDto = BLACK, price = 123.toBigDecimal()),
			ProductLocalizationDto(1L, 1L, 1L),
			100L
		)

		//then
		assertThat(productAddressRepository.existsById(productId))
		assertThat(productAddressRepository.count()).isGreaterThan(sizeBeforeAdding)
	}

	@Test
	fun `should mark product to buy`() {
		//given
		val productId = warehouseService.addNewProductToWarehouse(
			ProductDataDto(name = "some extra name", colorDto = BLACK, price = 123.toBigDecimal()),
			ProductLocalizationDto(1L, 1L, 1L),
			100L
		)
		val productPrice = 100.toBigDecimal()

		//when
		val result = warehouseService.markProductAsToBuy(productId, productPrice)
		val addedProduct = productRepository.findById(result!!.id!!)

		//then
		assertThat(result).isNotNull()
		assertThat(result.id).isEqualTo(productId)
		assertThat(result.price).isEqualTo(productPrice)
		assertThat(addedProduct.isPresent).isTrue()
		assertThat(addedProduct.filter { it.status == TO_BUY }.isPresent).isTrue()
	}

	@Test
	fun `should return null when provide wrong productId`() {
		//given
		val incorrectProductId = -1L
		val productPrice = 100.toBigDecimal()

		//when
		val result = warehouseService.markProductAsToBuy(incorrectProductId, productPrice)

		//then
		assertThat(result).isNull()
	}
}
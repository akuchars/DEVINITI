package akuchars.application.store.command

import akuchars.application.store.model.OrderDto
import akuchars.application.store.model.OrderItemDto
import akuchars.application.warehouse.command.WarehouseService
import akuchars.application.warehouse.model.ProductColorDto.BLACK
import akuchars.application.warehouse.model.ProductDataDto
import akuchars.application.warehouse.model.ProductLocalizationDto
import akuchars.domain.store.repository.OrderRepository
import akuchars.domain.store.repository.ProductRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import java.math.BigDecimal
import kotlin.properties.Delegates

abstract class AbstractOrderServiceTest {

	@Autowired
	protected lateinit var orderService: OrderService

	@Autowired
	protected lateinit var warehouseService: WarehouseService

	@Autowired
	protected lateinit var orderRepository: OrderRepository

	@Autowired
	protected lateinit var productRepository: ProductRepository

	protected var productId: Long by Delegates.notNull()

	@BeforeEach
	internal fun setUp() {
		productId = addNewProduct()
		warehouseService.markProductAsToBuy(productId, BigDecimal.TEN)
	}

	abstract fun assertAfterCreateNewOrder(result: OrderDto?)

	@Test
	fun `should create new order when amount is ok`() {
		//when
		val result = createNewOrder(productId)
		//then
		assertAfterCreateNewOrder(result)
	}

	protected fun addNewProduct(): Long {
		return warehouseService.addNewProductToWarehouse(
			ProductDataDto(name = "", colorDto = BLACK, price = BigDecimal.TEN),
			ProductLocalizationDto(1L, 1L, 1L),
			PRODUCT_AMOUNT_IN_WAREHOUSE
		)
	}

	protected fun createNewOrder(productId: Long): OrderDto {
		return orderService.createNewOrder(1L, OrderDto(null, listOf(
			OrderItemDto(productId, NUMBER_OF_PRODUCT_TO_ORDER)
		)))
	}

	companion object {
		const val PRODUCT_AMOUNT_IN_WAREHOUSE = 100L
		const val NUMBER_OF_PRODUCT_TO_ORDER = PRODUCT_AMOUNT_IN_WAREHOUSE - 1
	}

}
package akuchars.application.warehouse.command

import akuchars.application.store.command.AbstractOrderServiceTest
import akuchars.application.store.model.OrderDto
import akuchars.application.warehouse.query.ProductQueryService
import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isLessThan
import assertk.catch
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class CreatedOrderWarehouseListenerTest : AbstractOrderServiceTest() {

	@Autowired
	private lateinit var productQueryService: ProductQueryService

	override fun assertAfterCreateNewOrder(result: OrderDto?) {
		val newAmount = productQueryService.getAmountOfProduct(productId)

		//then
		assertThat(newAmount).isLessThan(PRODUCT_AMOUNT_IN_WAREHOUSE)
	}

	@Test
	fun `should decrease products amount in warehouse`() {
		//when
		createNewOrder(productId)
		val newAmount = productQueryService.getAmountOfProduct(productId)

		//then
		assertThat(newAmount).isLessThan(PRODUCT_AMOUNT_IN_WAREHOUSE)
	}

	@Test
	fun `should not decrease products amount in warehouse when did not add new order`() {
		//when
		val anotherProductId = addNewProduct()
		catch { createNewOrder(anotherProductId) }
		val productAmount = productQueryService.getAmountOfProduct(anotherProductId)

		//then
		assertThat(productAmount).isEqualTo(PRODUCT_AMOUNT_IN_WAREHOUSE)
	}
}
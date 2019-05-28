package akuchars.application.store.command

import akuchars.application.store.model.OrderDto
import akuchars.domain.store.model.ProductStatus.SOLD
import assertk.assertThat
import assertk.assertions.isNotNull
import assertk.assertions.isTrue
import assertk.catch
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class OrderServiceTest : AbstractOrderServiceTest() {

	override fun assertAfterCreateNewOrder(result: OrderDto?) {
		assertThat(result).isNotNull()
		assertThat(result!!.id).isNotNull()
		assertThat(orderRepository.existsById(result.id!!))
		val isProductSold = productRepository.findById(productId).filter { it.status === SOLD }.isPresent
		assertThat(isProductSold).isTrue()
	}

	@Test
	fun `should not create order when validation is not correct`() {
		//given
		val productNotToBuyId = addNewProduct()

		//then
		val exc = catch { createNewOrder(productNotToBuyId) }

		assertThat(exc).isNotNull()
	}


}
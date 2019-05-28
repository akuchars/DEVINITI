package akuchars.application.store.command

import akuchars.application.store.model.OrderDto
import akuchars.domain.store.model.Product
import akuchars.domain.store.model.ProductStatus
import assertk.assertThat
import assertk.assertions.isTrue
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class CreatedOrderStoreListenerTest : AbstractOrderServiceTest() {

	override fun assertAfterCreateNewOrder(result: OrderDto?) {
		val isProductMarkedAsSold = productRepository.findById(result!!.orderItemDto[0].productId)
			.map(Product::getStatus)
			.filter { it == ProductStatus.SOLD }
			.isPresent
		assertThat(isProductMarkedAsSold).isTrue()
	}

}
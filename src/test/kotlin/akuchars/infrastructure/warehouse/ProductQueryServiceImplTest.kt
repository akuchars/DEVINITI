package akuchars.infrastructure.warehouse

import akuchars.application.warehouse.model.ProductStatusDto
import akuchars.application.warehouse.query.ProductQueryService
import assertk.assertThat
import assertk.assertions.isEmpty
import assertk.assertions.isGreaterThan
import assertk.assertions.isNotEmpty
import assertk.assertions.isNotNull
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest

@SpringBootTest
internal class ProductQueryServiceImplTest {

	@Autowired
	private lateinit var productQueryService: ProductQueryService

	@Test
	fun `should find products by name`() {
		//given
		val searchProductName = "Produkt1"
		//when
		val result = productQueryService.getProductsByName(searchProductName)

		//then
		assertThat(result).isNotNull()
		assertThat(result.products).isNotNull().isNotEmpty()
		assertThat(result.products.map { it.data.name }.all { it.contentEquals(searchProductName) }).isTrue()
	}

	@Test
	fun `should find no products by name when provide incorrect name`() {
		//given
		val searchProductName = "Tego produktu na pewno nie ma w bazie"
		//when
		val result = productQueryService.getProductsByName(searchProductName)

		//then
		assertThat(result).isNotNull()
		assertThat(result.products).isNotNull().isEmpty()
	}

	@Test
	fun `should find only ready to buy products`() {
		//when
		val result = productQueryService.getProductReadyToBuy(PageRequest.of(1, 200))

		//then
		assertThat(result).isNotNull()
		assertThat(result.totalElements).isGreaterThan(0L)
		assertThat(result.all { it.status === ProductStatusDto.TO_BUY }).isTrue()
	}
}
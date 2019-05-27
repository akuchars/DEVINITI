package akuchars.domain.warehouse

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.Product
import akuchars.domain.warehouse.ProductAddressTest.ProductAddressTestCase
import io.mockk.mockk

internal class ProductAddressTest : ModelParametrizedTest<ProductAddress, ProductAddressTestCase>() {

	override fun getRunnerForBotDetecting(it: ProductAddressTestCase): ProductAddress =
		ProductAddress(it.product, it.street, it.stillage, it.shelf, it.productAmount)

	override fun getArgumentsForBotDetecting(): List<ProductAddressTestCase> = listOf(
		ProductAddressTestCase(mockk(), mockk(), mockk(), mockk(), mockk()),
		ProductAddressTestCase(null, mockk(), mockk(), mockk(), mockk(), IllegalArgumentException("product")),
		ProductAddressTestCase(mockk(), null, mockk(), mockk(), mockk(), IllegalArgumentException("street")),
		ProductAddressTestCase(mockk(), mockk(), null, mockk(), mockk(), IllegalArgumentException("stillage")),
		ProductAddressTestCase(mockk(), mockk(), mockk(), null, mockk(), IllegalArgumentException("shelf")),
		ProductAddressTestCase(mockk(), mockk(), mockk(), mockk(), null, IllegalArgumentException("productAmount"))
	)

	inner class ProductAddressTestCase(
		val product: Product?,
		val street: Street?,
		val stillage: Stillage?,
		val shelf: Shelf?,
		val productAmount: ProductAmount?,
		expectedException: Exception? = null
	) : AbstractTestCase<ProductAddress>(expectedException = expectedException)
}
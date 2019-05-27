package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.ProductNameTest.ProductNameTestCase

internal class ProductNameTest : ModelParametrizedTest<ProductName, ProductNameTestCase>() {

	override fun getRunnerForBotDetecting(it: ProductNameTestCase): ProductName =
		ProductName(it.value)

	override fun getArgumentsForBotDetecting(): List<ProductNameTestCase> = listOf(
		ProductNameTestCase(""),
		ProductNameTestCase(null, IllegalArgumentException("value"))
	)

	inner class ProductNameTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<ProductName>(expectedException = expectedException)
}
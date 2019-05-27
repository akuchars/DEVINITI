package akuchars.domain.warehouse

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.warehouse.ShelfTest.ShelfTestCase

internal class ShelfTest : ModelParametrizedTest<Shelf, ShelfTestCase>() {

	override fun getRunnerForBotDetecting(it: ShelfTestCase): Shelf =
		Shelf(it.value)

	override fun getArgumentsForBotDetecting(): List<ShelfTestCase> = listOf(
		ShelfTestCase(""),
		ShelfTestCase(null, IllegalArgumentException("name"))
	)

	inner class ShelfTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<Shelf>(expectedException = expectedException)
}
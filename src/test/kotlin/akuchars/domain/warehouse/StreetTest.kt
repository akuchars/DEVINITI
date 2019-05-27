package akuchars.domain.warehouse

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.warehouse.StreetTest.StreetTestCase

internal class StreetTest : ModelParametrizedTest<Street, StreetTestCase>() {

	override fun getRunnerForBotDetecting(it: StreetTestCase): Street =
		Street(it.value)

	override fun getArgumentsForBotDetecting(): List<StreetTestCase> = listOf(
		StreetTestCase(""),
		StreetTestCase(null, IllegalArgumentException("name"))
	)

	inner class StreetTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<Street>(expectedException = expectedException)
}
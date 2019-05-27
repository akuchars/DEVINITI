package akuchars.domain.warehouse

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.warehouse.StillageTest.StillageTestCase

internal class StillageTest : ModelParametrizedTest<Stillage, StillageTestCase>() {

	override fun getRunnerForBotDetecting(it: StillageTestCase): Stillage =
		Stillage(it.value)

	override fun getArgumentsForBotDetecting(): List<StillageTestCase> = listOf(
		StillageTestCase(""),
		StillageTestCase(null, IllegalArgumentException("name"))
	)

	inner class StillageTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<Stillage>(expectedException = expectedException)
}
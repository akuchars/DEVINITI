package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.CityTest.CityTestCase

internal class CityTest : ModelParametrizedTest<City, CityTestCase>() {

	override fun getRunnerForBotDetecting(it: CityTestCase): City = City(it.value)

	override fun getArgumentsForBotDetecting(): List<CityTestCase> = listOf(
		CityTestCase("Some country name"),
		CityTestCase(null, IllegalArgumentException("city"))
	)

	inner class CityTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<City>(expectedException = expectedException)
}
package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.CountryTest.CountryTestCase

internal class CountryTest : ModelParametrizedTest<Country, CountryTestCase>() {

	override fun getRunnerForBotDetecting(it: CountryTestCase): Country =
		Country(it.value)

	override fun getArgumentsForBotDetecting(): List<CountryTestCase> = listOf(
		CountryTestCase(""),
		CountryTestCase(null, IllegalArgumentException("country"))
	)

	inner class CountryTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<Country>(expectedException = expectedException)
}
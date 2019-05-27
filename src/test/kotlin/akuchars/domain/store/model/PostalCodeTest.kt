package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.PostalCodeTest.PostalCodeTestCase

internal class PostalCodeTest : ModelParametrizedTest<PostalCode, PostalCodeTestCase>() {

	override fun getRunnerForBotDetecting(it: PostalCodeTestCase): PostalCode =
		PostalCode(it.value)

	override fun getArgumentsForBotDetecting(): List<PostalCodeTestCase> = listOf(
		PostalCodeTestCase("123456"),
		PostalCodeTestCase(null, IllegalArgumentException("postalCode")),
		PostalCodeTestCase("123", IllegalArgumentException("Postal code must contain 6 chars")),
		PostalCodeTestCase("1234567", IllegalArgumentException("Postal code must contain 6 chars"))
	)

	inner class PostalCodeTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<PostalCode>(expectedException = expectedException)
}
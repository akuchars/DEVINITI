package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.EmailTest.EmailTestCase

internal class EmailTest : ModelParametrizedTest<Email, EmailTestCase>() {

	override fun getRunnerForBotDetecting(it: EmailTestCase): Email =
		Email(it.value)

	override fun getArgumentsForBotDetecting(): List<EmailTestCase> = listOf(
		EmailTestCase(""),
		EmailTestCase(null, IllegalArgumentException("value"))
	)

	inner class EmailTestCase(
		val value: String?,
		expectedException: Exception? = null
	) : AbstractTestCase<Email>(expectedException = expectedException)
}
package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.ClientTest.ClientTestCase
import io.mockk.mockk

internal class ClientTest : ModelParametrizedTest<Client, ClientTestCase>() {

	override fun getRunnerForBotDetecting(it: ClientTestCase): Client =
		Client(it.firstName, it.secondName, it.clientAddress, it.email)

	override fun getArgumentsForBotDetecting(): List<ClientTestCase> = listOf(
		ClientTestCase("", "", mockk(), mockk()),
		ClientTestCase(null, "", mockk(), mockk(), IllegalArgumentException("name")),
		ClientTestCase("", null, mockk(), mockk(), IllegalArgumentException("surname")),
		ClientTestCase("", "", null, mockk(), IllegalArgumentException("address")),
		ClientTestCase("", "", mockk(), null, IllegalArgumentException("email"))
	)

	inner class ClientTestCase(
		val firstName: String?,
		val secondName: String?,
		val clientAddress: ClientAddress?,
		val email: Email?,
		expectedException: Exception? = null
	) : AbstractTestCase<Client>(expectedException = expectedException)
}
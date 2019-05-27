package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.OrderTest.OrderTestCase
import io.mockk.mockk

internal class OrderTest : ModelParametrizedTest<Order, OrderTestCase>() {

	override fun getRunnerForBotDetecting(it: OrderTestCase): Order =
		Order(it.client, it.orderItems)

	override fun getArgumentsForBotDetecting(): List<OrderTestCase> = listOf(
		OrderTestCase(mockk(), listOf()),
		OrderTestCase(null, listOf(), IllegalArgumentException("client")),
		OrderTestCase(mockk(), null, IllegalArgumentException("items"))
	)

	inner class OrderTestCase(
		val client: Client?,
		val orderItems: List<OrderItem>?,
		expectedException: Exception? = null
	) : AbstractTestCase<Order>(expectedException = expectedException)
}
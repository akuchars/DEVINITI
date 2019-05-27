package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.OrderItemsAmountTest.OrderItemsAmountTestCase

internal class OrderItemsAmountTest : ModelParametrizedTest<OrderItemsAmount, OrderItemsAmountTestCase>() {

	override fun getRunnerForBotDetecting(it: OrderItemsAmountTestCase): OrderItemsAmount =
		OrderItemsAmount(it.value)

	override fun getArgumentsForBotDetecting(): List<OrderItemsAmountTestCase> = listOf(
		OrderItemsAmountTestCase(10L),
		OrderItemsAmountTestCase(-10L, IllegalArgumentException("Amount must be positive")),
		OrderItemsAmountTestCase(0)
	)

	inner class OrderItemsAmountTestCase(
		val value: Long,
		expectedException: Exception? = null
	) : AbstractTestCase<OrderItemsAmount>(expectedException = expectedException)
}
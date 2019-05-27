package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.OrderItemTest.OrderItemTestCase
import io.mockk.mockk

internal class OrderItemTest : ModelParametrizedTest<OrderItem, OrderItemTestCase>() {

	override fun getRunnerForBotDetecting(it: OrderItemTestCase): OrderItem =
		OrderItem(it.product, it.amount)

	override fun getArgumentsForBotDetecting(): List<OrderItemTestCase> = listOf(
		OrderItemTestCase(mockk(), mockk()),
		OrderItemTestCase(null, mockk(), IllegalArgumentException("product")),
		OrderItemTestCase(mockk(), null, IllegalArgumentException("amount"))
	)

	inner class OrderItemTestCase(
		val product: Product?,
		val amount: OrderItemsAmount?,
		expectedException: Exception? = null
	) : AbstractTestCase<OrderItem>(expectedException = expectedException)
}
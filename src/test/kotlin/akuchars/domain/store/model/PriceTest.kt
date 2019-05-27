package akuchars.domain.store.model

import akuchars.domain.AbstractTestCase
import akuchars.domain.ModelParametrizedTest
import akuchars.domain.store.model.PriceTest.PriceTestCase
import java.math.BigDecimal

internal class PriceTest : ModelParametrizedTest<Price, PriceTestCase>() {

	override fun getRunnerForBotDetecting(it: PriceTestCase): Price =
		Price(it.value)

	override fun getArgumentsForBotDetecting(): List<PriceTestCase> = listOf(
		PriceTestCase(BigDecimal.TEN),
		PriceTestCase(BigDecimal.ZERO, IllegalArgumentException("Price must be positive")),
		PriceTestCase(BigDecimal.valueOf(-10L), IllegalArgumentException("Price must be positive"))
	)

	inner class PriceTestCase(
		val value: BigDecimal?,
		expectedException: Exception? = null
	) : AbstractTestCase<Price>(expectedException = expectedException)
}
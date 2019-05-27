package akuchars.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

abstract class ModelParametrizedTest<MODEL, T : AbstractTestCase<MODEL>> {

	private fun `should create entity`(testCase: T, mapper: (T) -> MODEL) {
		val eitherModel = kotlin.runCatching { mapper.invoke(testCase) }

		//then
		testCase.assertion(assertion = {
			Assertions.assertThat(eitherModel.getOrNull()).isNotNull
		}, assertionFail = {
			Assertions.assertThat(eitherModel.exceptionOrNull()).isNotNull()
				.isExactlyInstanceOf(testCase.expectedException?.javaClass)
				.hasMessageContaining(testCase.expectedException?.message)

		})
	}

	@TestFactory
	fun `should run tests for jpa entity id`() =
		getArgumentsForBotDetecting().map {
			DynamicTest.dynamicTest(this.javaClass.simpleName + " $it") {
				`should create entity`(it, this::getRunnerForBotDetecting)
			}
		}

	abstract fun getRunnerForBotDetecting(it: T): MODEL

	abstract fun getArgumentsForBotDetecting(): List<T>
}
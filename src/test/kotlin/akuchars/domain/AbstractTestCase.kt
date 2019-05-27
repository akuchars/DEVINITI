package akuchars.domain

abstract class AbstractTestCase<MODEL>(val expectedException: Exception? = null, val expectedModel: MODEL? = null) {

	fun assertion(assertion: (() -> Unit), assertionFail: () -> Unit) {
		when (expectedException) {
			null -> assertion.invoke()
			else -> assertionFail.invoke()
		}
	}
}
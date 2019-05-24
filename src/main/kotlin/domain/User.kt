package domain

import kernel.ApplicationProperties.EMAIL_VALID_REGEX
import org.springframework.util.Assert

class User(
	val name: String,
	val surname: String,
	val address: Address,
	val email: Email
)

class Address()

class Email(private val value: String) {
	init {
		Assert.isTrue(value.matches(EMAIL_VALID_REGEX.toRegex()), "Email is not valid")
	}
}
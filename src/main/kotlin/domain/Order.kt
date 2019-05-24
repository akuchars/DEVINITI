package domain

import org.springframework.util.Assert

class Order(
	private val user: User,
	private val products: Collection<Product>
) {
	init {
		Assert.isTrue(products.isEmpty().not(), "Order must contains at least one element")
	}
}
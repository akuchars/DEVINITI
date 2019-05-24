package domain

import org.springframework.util.Assert
import java.math.BigDecimal

class Product(
	private val name: ProductName,
	private val color: ProductColor,
	private val price: ProductPrice
)

class ProductName(private val name: String)
class ProductColor(private val color: String)
class ProductPrice(private val price: BigDecimal) {
	init {
		Assert.isTrue(price > BigDecimal.ZERO, "Price must be positive")
	}
}
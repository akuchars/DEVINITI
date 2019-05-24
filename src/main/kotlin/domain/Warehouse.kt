package domain

import org.springframework.util.Assert

class Warehouse(
	internal val streets: List<Street> = listOf()
) {
	fun addProduct(product: Product, shelfId: Long) {

	}
}

class Street(
	internal val warehouseStreet: Long,
	internal val bookstands: Collection<Bookstand> = listOf()
)

class Bookstand(
	internal val bookstandId: Long,
	internal val shelfs: Collection<Shelf> = listOf()
)

sealed class Shelf(val number: Long) {
	init {
		Assert.isTrue(number > 0, "Shelf number must be positive")
	}
}
class EmptyShelf(number: Long): Shelf(number)
class ShelfWithProduct(number: Long, product: Product)
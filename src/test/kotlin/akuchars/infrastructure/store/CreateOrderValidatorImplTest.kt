package akuchars.infrastructure.store

import akuchars.domain.store.model.Order
import akuchars.domain.store.model.OrderItem
import akuchars.domain.store.model.OrderItemsAmount
import akuchars.domain.warehouse.ProductAddressRepository
import assertk.assertThat
import assertk.assertions.isInstanceOf
import assertk.assertions.isNotNull
import assertk.assertions.isTrue
import assertk.catch
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test

internal class CreateOrderValidatorImplTest {

	private val productAddressRepository: ProductAddressRepository = mockk()
	private val validator = CreateOrderValidatorImpl(productAddressRepository)

	@Test
	fun `should validate order without errors`() {
		//given
		val order = buildOrder(true)
		every { productAddressRepository.findById(any()).get().productAmount.amount } returns 100L

		//when
		val result = validator.validateThatOrderCanBeComplex(order)

		//then
		assertThat(result).isTrue()
	}

	@Test
	fun `should throw exception when product is not ready to buy`() {
		//given
		val order = buildOrder(false)

		//when
		val exc = catch { validator.validateThatOrderCanBeComplex(order) }

		//then
		assertThat(exc).isNotNull().isInstanceOf(ProductIsNotReadyToBuyException::class)
	}

	@Test
	fun `should throw exception when product is not in warehouse`() {
		//given
		val order = buildOrder(true)
		every { productAddressRepository.findById(any()).get().productAmount.amount } returns 0L

		//when
		val exc = catch { validator.validateThatOrderCanBeComplex(order) }

		//then
		assertThat(exc).isNotNull().isInstanceOf(ProductNotInWarehouseException::class)
	}

	private fun buildOrder(isReadyToBuyProperties: Boolean): Order {
		return mockk {
			every { items } returns listOf(OrderItem(
				mockk(relaxed = true) {
					every { isReadyToBuy } returns isReadyToBuyProperties
				}, OrderItemsAmount(10L))
			)
		}
	}

}
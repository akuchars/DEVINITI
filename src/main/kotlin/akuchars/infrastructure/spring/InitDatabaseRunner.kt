package akuchars.infrastructure.spring

import akuchars.domain.store.model.*
import akuchars.domain.store.repository.ClientAddressRepository
import akuchars.domain.store.repository.ClientRepository
import akuchars.domain.store.repository.ProductRepository
import akuchars.domain.warehouse.*
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class InitDatabaseRunner(
        private val productRepository: ProductRepository,
        private val streetRepository: StreetRepository,
        private val stillageRepository: StillageRepository,
        private val shelfRepository: ShelfRepository,
        private val productAddressRepository: ProductAddressRepository,
        private val clientAddressRepository: ClientAddressRepository,
        private val clientRepository: ClientRepository,
        private val applicationEventPublisher: ApplicationEventPublisher
) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        val address = ClientAddress("Some street", "14a", "1.1", PostalCode("47-100"),
                City("Kraków"), Country("Poland"))
        clientAddressRepository.save(address)

        val client = Client("Client name", "Client surname", address, Email("some@gmail.com"))
        clientRepository.save(client)

        val products = (1..100).map {
            Product(
                    generateProductName(it),
                    Color.YELLOW,
                    it.toBigDecimal().let(::Price)
            ).markToBuy(applicationEventPublisher, it.toBigDecimal())
        }.map { productRepository.save(it) }

        val s = (1..100).map { Street("Strret name: $it") }.map { streetRepository.save(it) }
        val st = (1..100).map { Stillage("Stillage name: $it") }.map { stillageRepository.save(it) }
        val sh = (1..100).map { Shelf("Shelf name: $it") }.map { shelfRepository.save(it) }

        products.mapIndexed { index, it ->
            ProductAddress(it, s[index], st[index], sh[index], (index + 1).toLong().let(::ProductAmount))
        }.forEach { productAddressRepository.save(it) }
    }

    private fun generateProductName(productIndex: Int): ProductName =
            arrayOf("Produkt1", "Produkt2", "Produkt3", "Produkt4")[productIndex % 4].let(::ProductName)
}
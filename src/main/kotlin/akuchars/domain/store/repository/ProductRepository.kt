package akuchars.domain.store.repository

import akuchars.domain.store.model.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long>
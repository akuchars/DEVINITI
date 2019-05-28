package akuchars.application.warehouse.query

import akuchars.application.warehouse.model.ProductDto
import akuchars.application.warehouse.model.ProductsDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ProductQueryService {
	fun getProductsByName(productName: String): ProductsDto
	fun getProductReadyToBuy(pageable: Pageable): Page<ProductDto>
	fun getAmountOfProduct(productId: Long): Long
}
package akuchars.application.warehouse.query

import akuchars.application.warehouse.model.ProductDto
import akuchars.application.warehouse.model.ProductsDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ProductQueryService {
    fun findProductsByName(productName: String): ProductsDto
    fun findProductReadyToBuy(pageable: Pageable): Page<ProductDto>
}
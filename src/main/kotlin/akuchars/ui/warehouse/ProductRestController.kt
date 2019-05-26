package akuchars.ui.warehouse

import akuchars.application.warehouse.command.WarehouseService
import akuchars.application.warehouse.model.ProductDataDto
import akuchars.application.warehouse.model.ProductDto
import akuchars.application.warehouse.query.ProductQueryService
import akuchars.ui.rest.dto.ProductDataRestDto
import akuchars.ui.rest.dto.ProductRestDto
import akuchars.ui.rest.dto.ProductsRestDto
import akuchars.ui.rest.dto.toRestDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/warehouse/products")
class ProductRestController(
        private val warehouseService: WarehouseService,
        private val productQueryService: ProductQueryService
) {

    @PostMapping("/{productId}/markToBuy")
    fun markToBuy(@PathVariable productId: Long, @RequestParam amount: BigDecimal): ProductDataRestDto? {
        return warehouseService.markProductAsToBuy(productId, amount)?.toRestDto()
    }

    @ResponseBody
    @GetMapping("/{productName}")
    fun getProductsByName(@PathVariable productName: String): ProductsRestDto {
        return productQueryService.findProductsByName(productName).toRestDto()
    }

    @GetMapping("/available")
    fun getAvailableProduct(
            @RequestParam(defaultValue = "0") page: Int,
            @RequestParam(defaultValue = "500") size: Int
    ): Page<ProductRestDto> {
        return productQueryService.findProductReadyToBuy(PageRequest.of(page, size)).map { it.toRestDto() }
    }
}
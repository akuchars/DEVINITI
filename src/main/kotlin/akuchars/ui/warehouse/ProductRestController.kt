package akuchars.ui.warehouse

import akuchars.application.warehouse.command.WarehouseService
import akuchars.application.warehouse.query.ProductQueryService
import akuchars.ui.rest.dto.ProductCreatorRestDto
import akuchars.ui.rest.dto.ProductDataRestDto
import akuchars.ui.rest.dto.ProductRestDto
import akuchars.ui.rest.dto.ProductsRestDto
import akuchars.ui.rest.dto.toDto
import akuchars.ui.rest.dto.toRestDto
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiImplicitParams
import io.swagger.annotations.ApiOperation
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/api/warehouse/products")
class ProductRestController(
	private val warehouseService: WarehouseService,
	private val productQueryService: ProductQueryService
) {

	@ApiOperation("Create new order")
	@ApiImplicitParams(
		ApiImplicitParam(name = "productId", value = "Product id", required = true, dataType = "long", paramType = "path"),
		ApiImplicitParam(name = "amount", value = "Amount to sale product", required = true, dataType = "long", paramType = "query")
	)
	@PostMapping("/{productId}/markToBuy")
	fun markToBuy(@PathVariable productId: Long, @RequestParam amount: BigDecimal): ProductDataRestDto? {
		return warehouseService.markProductAsToBuy(productId, amount)?.toRestDto()
	}

	@ApiOperation("Get products for given name")
	@ApiImplicitParams(
		ApiImplicitParam(name = "productName", value = "Product id", required = true, dataType = "string", paramType = "path")
	)
	@ResponseBody
	@GetMapping("/{productName}")
	fun getProductsByName(@PathVariable productName: String): ProductsRestDto {
		return productQueryService.getProductsByName(productName).toRestDto()
	}

	@ApiOperation("Create product and add to warehouse")
	@ApiImplicitParams(
		ApiImplicitParam(name = "productCreatorRestDto", value = "Product data with localization", required = true, dataTypeClass = ProductCreatorRestDto::class, paramType = "body")
	)
	@ResponseBody
	@PostMapping("/create")
	fun addProductToWarehouse(@RequestBody productCreatorRestDto: ProductCreatorRestDto): ProductRestDto {
		return warehouseService.addNewProductToWarehouse(
			productCreatorRestDto.productDataRestDto.toDto(),
			productCreatorRestDto.productLocalizationRestDto.toDto(),
			productCreatorRestDto.amount
		).toRestDto()
	}

	@ApiOperation("Get available to buy products")
	@ApiImplicitParams(
		ApiImplicitParam(name = "page", value = "Actual page", required = false, dataType = "long", paramType = "query", defaultValue = "0"),
		ApiImplicitParam(name = "size", value = "Maximum items on page", required = false, dataType = "long", paramType = "query", defaultValue = "500")
	)
	@GetMapping("/available")
	fun getAvailableProduct(
		@RequestParam(defaultValue = "0") page: Int,
		@RequestParam(defaultValue = "500") size: Int
	): Page<ProductRestDto> {
		return productQueryService.getProductReadyToBuy(PageRequest.of(page, size)).map { it.toRestDto() }
	}
}


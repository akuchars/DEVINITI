package akuchars.ui.rest.dto

import akuchars.application.warehouse.model.ProductLocalizationDto
import java.math.BigDecimal

class ProductsRestDto(val products: List<ProductRestDto> = listOf())

class ProductRestDto(
	val data: ProductDataRestDto,
	val localization: ProductLocalizationRestDto,
	val status: ProductStatusRestDto
)

enum class ProductStatusRestDto {
	NEW,
	IN_WAREHOUSE,
	TO_BUY,
	SOLD
}

class ProductLocalizationRestDto(
	val streetId: Long,
	val stillageId: Long,
	val shelfId: Long
)

class ProductDataRestDto(
	val id: Long,
	val name: String = "",
	val colorDto: ProductColorRestDto = ProductColorRestDto.YELLOW,
	val amount: BigDecimal = BigDecimal.ZERO
)

enum class ProductColorRestDto {
	BLACK, YELLOW
}

fun ProductLocalizationRestDto.toDto(): ProductLocalizationDto =
	ProductLocalizationDto(streetId, stillageId, shelfId)

package akuchars.application.warehouse.model

import akuchars.domain.store.model.ProductStatus

class ProductDto(
        val data: ProductDataDto,
        val localization: ProductLocalizationDto,
        val status: ProductStatusDto
)

enum class ProductStatusDto {
    NEW,
    IN_WAREHOUSE,
    TO_BUY,
    SOLD
}

fun ProductStatus.toDto(): ProductStatusDto {
    return when (this) {
        ProductStatus.NEW -> ProductStatusDto.NEW
        ProductStatus.IN_WAREHOUSE -> ProductStatusDto.IN_WAREHOUSE
        ProductStatus.TO_BUY -> ProductStatusDto.TO_BUY
        ProductStatus.SOLD -> ProductStatusDto.SOLD
    }
}

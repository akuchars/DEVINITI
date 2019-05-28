package akuchars.ui.rest.dto

import akuchars.application.store.model.OrderDto
import akuchars.application.store.model.OrderItemDto
import akuchars.application.warehouse.model.ProductColorDto
import akuchars.application.warehouse.model.ProductDataDto
import akuchars.application.warehouse.model.ProductDto
import akuchars.application.warehouse.model.ProductLocalizationDto
import akuchars.application.warehouse.model.ProductStatusDto
import akuchars.application.warehouse.model.ProductsDto

fun OrderRestDto.toDto(): OrderDto =
    OrderDto(id, orderItemDto.toDto())

fun List<OrderItemRestDto>.toDto(): List<OrderItemDto> =
        this.map { OrderItemDto(it.productId!!, it.amount!!) }

fun ProductsDto.toRestDto(): ProductsRestDto =
        ProductsRestDto(products.toRestDto())

fun ProductDto.toRestDto(): ProductRestDto = ProductRestDto(data.toRestDto(), localization.toRestDto(), status.toRestDto())

fun ProductStatusDto.toRestDto(): ProductStatusRestDto {
    return when(this) {
        ProductStatusDto.NEW -> ProductStatusRestDto.NEW
        ProductStatusDto.IN_WAREHOUSE -> ProductStatusRestDto.IN_WAREHOUSE
        ProductStatusDto.TO_BUY -> ProductStatusRestDto.TO_BUY
        ProductStatusDto.SOLD -> ProductStatusRestDto.SOLD
    }
}

fun List<ProductDto>.toRestDto(): List<ProductRestDto> =
        map { it.toRestDto() }

fun ProductLocalizationDto.toRestDto(): ProductLocalizationRestDto =
        ProductLocalizationRestDto(streetId, stillageId, shelfId)

fun ProductDataDto.toRestDto(): ProductDataRestDto =
    ProductDataRestDto(id!!, name, colorDto.toRestDto(), price)

fun ProductColorDto.toRestDto(): ProductColorRestDto =
        when (this) {
            ProductColorDto.BLACK -> ProductColorRestDto.BLACK
            ProductColorDto.YELLOW -> ProductColorRestDto.YELLOW
        }

fun OrderDto.toRestDto(): OrderRestDto = OrderRestDto(id, orderItemDto.map { OrderItemRestDto(it.productId, it.amount) })
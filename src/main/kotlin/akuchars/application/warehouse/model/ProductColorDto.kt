package akuchars.application.warehouse.model

import akuchars.domain.store.model.Color

enum class ProductColorDto {
    BLACK, YELLOW;

}

fun ProductColorDto.toEntity(): Color {
    return when(this) {
        ProductColorDto.BLACK -> Color.BLACK
        ProductColorDto.YELLOW -> Color.YELLOW
    }
}

fun Color.toDto(): ProductColorDto {
    return when(this) {

        Color.BLACK -> ProductColorDto.BLACK
        Color.YELLOW -> ProductColorDto.YELLOW
    }
}
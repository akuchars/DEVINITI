package akuchars.ui.rest.dto

class ProductCreatorRestDto(
	val productDataRestDto: ProductDataRestDto,
	val productLocalizationRestDto: ProductLocalizationRestDto,
	val amount: Long
)
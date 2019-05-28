package akuchars.application.warehouse.model

import java.math.BigDecimal

class ProductDataDto(
	val id: Long? = null,
	val name: String,
	val colorDto: ProductColorDto,
	val price: BigDecimal
)
package akuchars.domain.warehouse.event

import org.springframework.context.ApplicationEvent

class AddedProductToWarehouse(val id: Long, source: Any): ApplicationEvent(source)
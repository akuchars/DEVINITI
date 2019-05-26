package akuchars.domain.store.event

import org.springframework.context.ApplicationEvent

class CreatedOrderEvent(val orderId: Long, source: Any) : ApplicationEvent(source)
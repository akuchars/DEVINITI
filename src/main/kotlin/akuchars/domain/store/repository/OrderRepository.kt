package akuchars.domain.store.repository

import akuchars.domain.store.model.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, Long>
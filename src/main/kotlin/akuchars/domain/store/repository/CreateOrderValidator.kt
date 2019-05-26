package akuchars.domain.store.repository

import akuchars.domain.store.model.Order

interface CreateOrderValidator {
    fun validateThatOrderCanBeComplex(order: Order): Boolean
}
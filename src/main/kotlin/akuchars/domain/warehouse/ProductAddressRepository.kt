package akuchars.domain.warehouse

import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository

interface ProductAddressRepository : CrudRepository<ProductAddress, Long>, QuerydslPredicateExecutor<ProductAddress>
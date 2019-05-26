package akuchars.domain.warehouse

import org.springframework.data.repository.CrudRepository

interface StreetRepository : CrudRepository<Street, Long>
interface StillageRepository : CrudRepository<Stillage, Long>
interface ShelfRepository : CrudRepository<Shelf, Long>
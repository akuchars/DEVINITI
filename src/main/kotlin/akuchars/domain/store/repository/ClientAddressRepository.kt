package akuchars.domain.store.repository

import akuchars.domain.store.model.ClientAddress
import org.springframework.data.repository.CrudRepository

interface ClientAddressRepository : CrudRepository<ClientAddress, Long>
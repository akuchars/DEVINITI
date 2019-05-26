package akuchars.domain.store.repository

import org.springframework.data.repository.CrudRepository

interface ClientRepository: CrudRepository<akuchars.domain.store.model.Client, Long>
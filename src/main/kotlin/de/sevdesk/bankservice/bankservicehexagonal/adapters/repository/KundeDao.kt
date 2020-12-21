package de.sevdesk.bankservice.bankservicehexagonal.adapters.repository

import de.sevdesk.bankservice.bankservicehexagonal.adapters.KundeDbEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface KundeDao : CrudRepository<KundeDbEntity, Int>
{
}
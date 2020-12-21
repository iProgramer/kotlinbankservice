package de.sevdesk.bankservice.bankservicehexagonal.adapters.repository

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import de.sevdesk.bankservice.bankservicehexagonal.domain.ports.KundeRepository
import de.sevdesk.bankservice.bankservicehexagonal.adapters.KundeFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class KundeRepositoryImpl
@Autowired
constructor(
        val kundeDao: KundeDao) : KundeRepository
{
    override fun anlegen(kunde: Kunde): Int
    {
        val kundeDbEntity = KundeFactory().fromDomain(kunde)
        val savedKunde = kundeDao.save(kundeDbEntity)
        return savedKunde.kundennummer!!
    }

    override fun bearbeiten(kunde: Kunde)
    {
        TODO("Not yet implemented")
    }

    override fun laden(kundennummer: Int): Kunde?
    {
        val kundeDbEntity = kundeDao.findById(kundennummer)
        if (kundeDbEntity.isPresent)
        {
            return KundeFactory().toDomain(kundeDbEntity.get())
        } else
        {
            return null
        }
    }

}
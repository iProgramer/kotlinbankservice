package de.sevdesk.bankservice.bankservicehexagonal.adapters.repository

import de.sevdesk.bankservice.bankservicehexagonal.adapters.KundeDbEntity
import de.sevdesk.bankservice.bankservicehexagonal.adapters.KundeFactory
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import de.sevdesk.bankservice.bankservicehexagonal.domain.ports.KundeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class KundeRepositoryImpl
@Autowired
constructor(
    val kundeDao: KundeDao
) : KundeRepository
{
    override fun anlegen(kunde: Kunde): Int
    {
        val kundeDbEntity = KundeDbEntity(kunde)
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

    override fun ladeAlleKunden(): List<Kunde>
    {
        val kunden = this.kundeDao.findAll().toList()

        return kunden.toList()
            .map(KundeFactory()::toDomain)
    }
}
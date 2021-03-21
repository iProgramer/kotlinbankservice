package de.sevdesk.bankservice.bankservicehexagonal.adapters

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Geschlecht
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde

class KundeFactory
{

    fun toDomain(kundeDbEntity: KundeDbEntity): Kunde
    {
        val kunde = Kunde(
            kundeDbEntity.kundennummer,
            kundeDbEntity.vorname,
            kundeDbEntity.nachname,
            kundeDbEntity.geburtsdatum,
            Geschlecht.valueOf(kundeDbEntity.geschlecht),
        )
        return kunde
    }

}
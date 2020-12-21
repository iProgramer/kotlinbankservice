package de.sevdesk.bankservice.bankservicehexagonal.domain.ports

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde

interface KundeRepository
{
    fun anlegen(kunde: Kunde): Int

    fun bearbeiten(kunde: Kunde)

    fun laden(kundennummer: Int): Kunde?
}

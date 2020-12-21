package de.sevdesk.bankservice.bankservicehexagonal.domain.service

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Konto
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Geschlecht
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import de.sevdesk.bankservice.bankservicehexagonal.domain.ports.KundeRepository
import java.time.LocalDate

class KundeService(private val kundeRepository: KundeRepository)
{
    fun erstelleKunde(kunde: Kunde) = this.kundeRepository.anlegen(kunde)

    fun zeigeKundendaten(kundennummer: Int): Kunde
    {
        val kunde = this.kundeRepository.laden(kundennummer)

        return kunde ?: throw KundeNichtGefundenException()
    }

    fun bearbeiteKunde(kunde: Kunde)
    {
        this.bearbeiteKunde(kunde)
    }

    fun zeigeKontenVonKunde(kundennummer: Int): Set<Konto>
    {
        val kunde = this.kundeRepository.laden(kundennummer)

        return kunde?.konten ?: throw KundeNichtGefundenException()
    }

}
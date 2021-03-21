package de.sevdesk.bankservice.bankservicehexagonal.domain.service

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Konto
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import de.sevdesk.bankservice.bankservicehexagonal.domain.ports.KundeRepository

class KundeService(private val kundeRepository: KundeRepository)
{
    fun erstelleKunde(kunde: Kunde): Kunde
    {
        val kundennummer = this.kundeRepository.anlegen(kunde)
        kunde.kundennummer = kundennummer
        return kunde
    }

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

    fun zeigeAlleKunden(): List<Kunde>
    {
        return this.kundeRepository.ladeAlleKunden()
    }

}
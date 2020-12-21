package de.sevdesk.bankservice.bankservicehexagonal.domain.service

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Konto
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.transaktion.Transaktion
import de.sevdesk.bankservice.bankservicehexagonal.domain.ports.KontoRepository
import java.time.LocalDateTime

class KontoService(private val kontoRepository: KontoRepository)
{

    fun anmelden(kontonummer: String, pin: String): Konto
    {
        return this.kontoRepository.laden(kontonummer, pin) ?: throw KontoAnmeldungFehlgeschlagenException()
    }

    fun legeKontoAn(konto: Konto) = this.kontoRepository.anlegen(konto)

    // does not has to be implemented as service method
    fun erhalteKontostand(konto: Konto) = konto.erhalteKontostand()

    fun einzahlen(konto: Konto, betrag: Double)
    {
        val transaktion = Transaktion(konto, LocalDateTime.now(), betrag, "Einzahlung")
        this.kontoRepository.erstelleTransaktion(transaktion)
    }

    fun abheben(konto: Konto, betrag: Double)
    {
        val transaktion = Transaktion(konto, LocalDateTime.now(), betrag * (-1), "Auszahlung")
        this.kontoRepository.erstelleTransaktion(transaktion)
    }

    fun ueberweisen(vonKonto: Konto, anKontonummer: String, betrag: Double, verwendungszweck: String): Transaktion?
    {
        val anKonto = this.kontoRepository.ladeKontoOhnePin(anKontonummer)

        val buchungsdatum = LocalDateTime.now()

        val transaktionVon = Transaktion(vonKonto, buchungsdatum, betrag * (-1), verwendungszweck)
        val transaktionAn = Transaktion(anKonto, buchungsdatum, betrag * 1, verwendungszweck)

        this.kontoRepository.ueberweisen(transaktionVon, transaktionAn)

        return transaktionVon
    }

}
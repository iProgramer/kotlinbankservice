package de.sevdesk.bankservice.bankservicehexagonal.domain.ports

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Konto
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.transaktion.Transaktion

interface KontoRepository
{

    fun anlegen(konto: Konto): String

    fun erstelleTransaktion(transaktion: Transaktion)

    fun ueberweisen(von: Transaktion, an: Transaktion)

    fun ladeKonto(kontonummer: String): Konto

    fun zeigeTransaktionen(kontonummer: String): List<Transaktion>

}

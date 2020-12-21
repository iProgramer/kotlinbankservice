package de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.transaktion.Transaktion

open class Konto(
        var name: String,
        var kontonummer: String,
        var inhaber: Kunde,
)
{

    val transaktionen: Set<Transaktion> = mutableSetOf()

    fun erhalteKontostand() = transaktionen.stream()
            .mapToDouble(Transaktion::betrag)
            .sum()

}
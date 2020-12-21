package de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde

class Festgeldkonto(
        name: String,
        kontonummer: String,
        inhaber: Kunde,
        anlegedauer: Int,
        private var zinsgutschrift: Zinsgutschrift,
) : Konto(name, kontonummer, inhaber),
        Verzinsbar
{

    override fun getZinsgutschrift() = zinsgutschrift


}
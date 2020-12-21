package de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde

class Tagesgeldkonto(
        name: String,
        kontonummer: String,
        inhaber: Kunde,
        private var zinsgutschrift: Zinsgutschrift,
) : Konto(name, kontonummer, inhaber),
        Verzinsbar
{

    override fun getZinsgutschrift() = zinsgutschrift

}
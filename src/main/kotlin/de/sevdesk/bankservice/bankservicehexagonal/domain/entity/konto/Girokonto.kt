package de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde

open class Girokonto(
        name: String,
        kontonummer: String,
        inhaber: Kunde,
        var limit: Double,
        var pin: String,
) : Konto(name, kontonummer, inhaber)

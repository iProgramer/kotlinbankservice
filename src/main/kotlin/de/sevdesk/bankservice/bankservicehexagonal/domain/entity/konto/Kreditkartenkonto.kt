package de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde

class Kreditkartenkonto(
    name: String,
    kontonummer: String,
    inhaber: Kunde,
    var verknuepftesKonto: Girokonto,
    var abbuchungsdauerInTagen: Int,
    var limit: Double,
    var pin: String,
) : Konto(name, kontonummer, inhaber)

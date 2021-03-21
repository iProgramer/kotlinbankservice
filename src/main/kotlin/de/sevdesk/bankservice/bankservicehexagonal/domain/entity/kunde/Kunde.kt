package de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Konto
import java.time.LocalDate

open class Kunde(
    var kundennummer: Int?,
    var vorname: String,
    var nachname: String,
    var geburtsdatum: LocalDate,
    var geschlecht: Geschlecht,
)
{

    val konten: Set<Konto> = mutableSetOf()

}
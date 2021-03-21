package de.sevdesk.bankservice.bankservicehexagonal.adapters.api.kunde

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Geschlecht
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import java.time.LocalDate

data class KundeDto(
    var kundennummer: Int?,
    var vorname: String,
    var nachname: String,
    var geburtsdatum: LocalDate,
    var geschlecht: Geschlecht,
)
{

    /**
     * 2nd Mapping Constructor
     */
    constructor(kunde: Kunde) : this(
        kunde.kundennummer,
        kunde.vorname,
        kunde.nachname,
        kunde.geburtsdatum,
        kunde.geschlecht
    )

}

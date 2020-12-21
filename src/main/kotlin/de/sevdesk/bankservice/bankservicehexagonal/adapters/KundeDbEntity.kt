package de.sevdesk.bankservice.bankservicehexagonal.adapters

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class KundeDbEntity(
        @Id
        @GeneratedValue
        var kundennummer: Int?,

        @Column
        var vorname: String,

        @Column
        var nachname: String,

        @Column
        var geburtsdatum: LocalDate,

        @Column
        var geschlecht: String,
)
{

}
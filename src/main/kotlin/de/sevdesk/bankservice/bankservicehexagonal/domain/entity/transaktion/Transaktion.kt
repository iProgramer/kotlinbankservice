package de.sevdesk.bankservice.bankservicehexagonal.domain.entity.transaktion

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Konto
import java.time.LocalDateTime

class Transaktion(
    var zugeordnetesKonto: Konto,
    var buchungsdatum: LocalDateTime,
    var betrag: Double,
    var verwendungszweck: String,
)

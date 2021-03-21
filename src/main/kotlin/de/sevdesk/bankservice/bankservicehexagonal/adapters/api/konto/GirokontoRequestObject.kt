package de.sevdesk.bankservice.bankservicehexagonal.adapters.api.konto

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde

data class GirokontoRequestObject(val name: String,
                                  val kontonummer: String,
                                  val inhaber: Kunde,
                                  val limit: Double,
                                  val pin: String,)

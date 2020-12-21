package de.sevdesk.bankservice.bankservicehexagonal.domain.ports

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Konto
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.transaktion.Transaktion

interface KontoRepository
{

    fun anlegen(konto: Konto): String

    fun laden(kontonummer: String, pin: String): Konto?

    fun erstelleTransaktion(transaktion: Transaktion)

    fun ueberweisen(vonTransaktion: Transaktion, anTransaktion: Transaktion)

    fun ladeKontoOhnePin(kontonummer: String): Konto

}

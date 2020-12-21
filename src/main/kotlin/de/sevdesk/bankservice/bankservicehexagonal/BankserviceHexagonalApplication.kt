package de.sevdesk.bankservice.bankservicehexagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankserviceHexagonalApplication

fun main(args: Array<String>)
{
    runApplication<BankserviceHexagonalApplication>(*args)
}

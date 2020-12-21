package de.sevdesk.bankservice.bankservicehexagonal.adapters.api

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Geschlecht
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import de.sevdesk.bankservice.bankservicehexagonal.domain.service.KundeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("kunden")
class KundeController
@Autowired
constructor(var kundeService: KundeService)
{

    @GetMapping("create")
    fun postKunde()
    {
        val k = Kunde(null, "Simon", "Poloczek", LocalDate.now(), Geschlecht.M)

        this.kundeService.erstelleKunde(k)
    }

    @GetMapping("{kundennummer}")
    fun getKunde(@PathVariable kundennummer: Int): Kunde
    {
        return this.kundeService.zeigeKundendaten(kundennummer)
    }

}
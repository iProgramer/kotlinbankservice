package de.sevdesk.bankservice.bankservicehexagonal.adapters.api.kunde

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Geschlecht
import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.kunde.Kunde
import de.sevdesk.bankservice.bankservicehexagonal.domain.service.KundeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@RestController
@RequestMapping("kunden")
class KundeApi @Autowired constructor(var kundeService: KundeService)
{

    @GetMapping("{kundennummer}")
    fun getKunde(@PathVariable kundennummer: Int): KundeDto
    {
        val kunde = this.kundeService.zeigeKundendaten(kundennummer)
        return KundeDto(kunde)
    }

    @GetMapping
    fun getAlleKunden(): List<KundeDto>
    {
        val alleKunden = this.kundeService.zeigeAlleKunden()
        return alleKunden.map { KundeDto(it) }
    }


    @PostMapping
    fun postKunde(@RequestBody kundeDto: KundeDto): Kunde
    {
        val kunde = Kunde(null, kundeDto.vorname, kundeDto.nachname, kundeDto.geburtsdatum, kundeDto.geschlecht)
        return this.kundeService.erstelleKunde(kunde)
    }

    @GetMapping("create")
    fun createKunde()
    {

        val kunde = Kunde(null, "Simon", "Poloczek", LocalDate.now(), Geschlecht.M)
        this.kundeService.erstelleKunde(kunde)
    }

}
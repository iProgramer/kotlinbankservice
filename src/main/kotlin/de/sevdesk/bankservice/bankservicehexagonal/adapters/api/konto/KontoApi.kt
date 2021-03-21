package de.sevdesk.bankservice.bankservicehexagonal.adapters.api.konto

import de.sevdesk.bankservice.bankservicehexagonal.domain.entity.konto.Girokonto
import de.sevdesk.bankservice.bankservicehexagonal.domain.service.KontoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("konto")
class KontoApi @Autowired constructor(var kontoService: KontoService)
{

    @PostMapping("girokonto")
    fun postGirokonto(@RequestBody girokontoRO: GirokontoRequestObject)
    {
    }

}
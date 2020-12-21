package de.sevdesk.bankservice.bankservicehexagonal.config

import de.sevdesk.bankservice.bankservicehexagonal.domain.ports.KundeRepository
import de.sevdesk.bankservice.bankservicehexagonal.domain.service.KundeService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguraiton
{

    @Bean
    fun kundeService(kundeRepository: KundeRepository) = KundeService(kundeRepository)

}
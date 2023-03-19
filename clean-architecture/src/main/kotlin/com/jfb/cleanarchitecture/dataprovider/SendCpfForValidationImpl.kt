package com.jfb.cleanarchitecture.dataprovider

import com.jfb.cleanarchitecture.core.dataprovider.SendCpfForValidation
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class SendCpfForValidationImpl(
    private val kafkaTemplate: KafkaTemplate<String, String>
): SendCpfForValidation {

    override fun send(cpf: String) {
        kafkaTemplate.send("tp-cpf-validation", cpf)
    }
}
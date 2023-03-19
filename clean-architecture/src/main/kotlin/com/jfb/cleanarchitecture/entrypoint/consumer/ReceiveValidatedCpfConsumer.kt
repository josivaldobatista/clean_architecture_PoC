package com.jfb.cleanarchitecture.entrypoint.consumer

import com.jfb.cleanarchitecture.core.usecase.UpdateCustomerUserCase
import com.jfb.cleanarchitecture.entrypoint.consumer.mapper.CustomerMessageMapper
import com.jfb.cleanarchitecture.entrypoint.consumer.message.CustomerMessage
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ReceiveValidatedCpfConsumer(
    private val updateCustomerUserCase: UpdateCustomerUserCase,
    private val customerMessageMapper: CustomerMessageMapper
) {

    @KafkaListener(topics = ["tp-cpf-validated"], groupId = "jfbatis")
    fun receive(customerMessage: CustomerMessage) {
        val customer = customerMessageMapper.toCustomer(customerMessage)
        updateCustomerUserCase.update(customer, customerMessage.zipCode)
    }
}
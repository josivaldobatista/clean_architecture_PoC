package com.jfb.cleanarchitecture.entrypoint.controller.mapper

import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest
import com.jfb.cleanarchitecture.entrypoint.controller.response.CustomerResponse
import java.util.*

fun CustomerRequest.toCustomer(): Customer {
    return Customer(
        id = UUID.randomUUID().toString(),
        name = this.name,
        cpf = this.cpf,
        isValidCpf = false
    )
}

//fun Customer.toCustomerResponse(): CustomerResponse {
//    return CustomerResponse(
//        name = this.name,
//        cpf = this.cpf,
//        isValidCpf = this.isValidCpf,
//        address = this.address
//    )
//}
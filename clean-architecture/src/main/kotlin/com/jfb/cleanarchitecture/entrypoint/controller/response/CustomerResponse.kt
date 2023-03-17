package com.jfb.cleanarchitecture.entrypoint.controller.response

data class CustomerResponse(
    var name: String,
    var cpf: String,
    var isValidCpf: Boolean,
    var address: AddressResponse
)
package com.jfb.cleanarchitecture.entrypoint.consumer.message

data class CustomerMessage(
    var id: String,
    var name: String,
    var zipCode: String,
    var cpf: String,
    var isValidCpf: Boolean
)
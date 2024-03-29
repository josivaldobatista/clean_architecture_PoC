package com.jfb.cleanarchitecture.core.domain

data class Customer(
    var id: String,
    var name: String,
    var cpf: String,
    var address: Address? = null,
    var isValidCpf: Boolean = false
)
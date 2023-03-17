package com.jfb.cleanarchitecture.dataprovider.repository.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customers")
data class CustomerEntity(
    @Id
    var id: String,
    var name: String,
    var cpf: String,
    var address: AddressEntity,
    var isValidCpf: Boolean
)
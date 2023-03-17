package com.jfb.cleanarchitecture.entrypoint.controller.request

import javax.validation.constraints.NotBlank

data class CustomerRequest(
    @field:NotBlank(message = "Nome deve ser informado")
    var name: String,
    @field:NotBlank(message = "CPF deve ser informado")
    var cpf: String,
    @field:NotBlank(message = "CEP deve ser informado")
    var zipCode: String
)

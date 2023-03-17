package com.jfb.cleanarchitecture.entrypoint.controller.mapper

import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest
import com.jfb.cleanarchitecture.entrypoint.controller.response.CustomerResponse
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    fun toCustomer(customerRequest: CustomerRequest): Customer

    fun toCustomerResponse(customer: Customer): CustomerResponse
}
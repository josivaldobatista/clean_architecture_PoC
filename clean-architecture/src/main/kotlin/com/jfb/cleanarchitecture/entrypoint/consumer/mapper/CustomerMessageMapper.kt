package com.jfb.cleanarchitecture.entrypoint.consumer.mapper

import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.entrypoint.consumer.message.CustomerMessage
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    fun toCustomer(customerMessage: CustomerMessage): Customer
}
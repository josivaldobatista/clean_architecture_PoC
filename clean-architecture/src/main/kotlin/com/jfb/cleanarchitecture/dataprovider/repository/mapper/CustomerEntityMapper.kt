package com.jfb.cleanarchitecture.dataprovider.repository.mapper

import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.dataprovider.repository.entity.CustomerEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustomerEntityMapper {

    fun toCustomerEntity(customer: Customer): CustomerEntity
}
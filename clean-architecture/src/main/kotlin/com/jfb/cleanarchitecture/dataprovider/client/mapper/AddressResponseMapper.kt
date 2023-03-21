package com.jfb.cleanarchitecture.dataprovider.client.mapper

import com.jfb.cleanarchitecture.core.domain.Address
import com.jfb.cleanarchitecture.dataprovider.client.response.AddressResponse
import org.mapstruct.Mapper
import org.mapstruct.NullValueCheckStrategy
import org.mapstruct.NullValuePropertyMappingStrategy

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
interface AddressResponseMapper {

    fun toAddress(addressResponse: AddressResponse): Address

}
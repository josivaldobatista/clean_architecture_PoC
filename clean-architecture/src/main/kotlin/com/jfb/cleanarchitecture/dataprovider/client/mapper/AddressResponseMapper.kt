package com.jfb.cleanarchitecture.dataprovider.client.mapper

import com.jfb.cleanarchitecture.core.domain.Address
import com.jfb.cleanarchitecture.dataprovider.client.response.AddressResponse
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AddressResponseMapper {

    fun toAddress(addressResponse: AddressResponse): Address

}
package com.jfb.cleanarchitecture.dataprovider

import com.jfb.cleanarchitecture.core.dataprovider.FindAddressByZipCode
import com.jfb.cleanarchitecture.core.domain.Address
import com.jfb.cleanarchitecture.dataprovider.client.FindAddressByZipCodeClient
import com.jfb.cleanarchitecture.dataprovider.client.mapper.AddressResponseMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeImpl(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient,
    private val addressResponseMapper: AddressResponseMapper
) : FindAddressByZipCode {

    override fun find(zipCode: String): Address {
        var addressResponse = findAddressByZipCodeClient.find(zipCode)
        return addressResponseMapper.toAddress(addressResponse)
    }
}
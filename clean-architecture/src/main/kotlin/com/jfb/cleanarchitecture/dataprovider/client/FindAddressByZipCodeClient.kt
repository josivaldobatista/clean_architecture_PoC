package com.jfb.cleanarchitecture.dataprovider.client

import com.jfb.cleanarchitecture.dataprovider.client.response.AddressResponse
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "\${jfb.client.address.url}"
)
interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    fun find(@PathVariable("zipCode") zipCode: String): AddressResponse
}
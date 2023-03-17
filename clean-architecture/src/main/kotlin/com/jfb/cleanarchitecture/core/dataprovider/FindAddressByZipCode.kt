package com.jfb.cleanarchitecture.core.dataprovider

import com.jfb.cleanarchitecture.core.domain.Address

interface FindAddressByZipCode {

    fun find(zipCode: String): Address
}
package com.jfb.cleanarchitecture.core.usecase.impl

import com.jfb.cleanarchitecture.core.dataprovider.FindAddressByZipCode
import com.jfb.cleanarchitecture.core.dataprovider.InsertCustomer
import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.core.usecase.InsertCustomerUseCase

class InsertCustomerUseCaseImpl(
    private val findAddressByZipCode: FindAddressByZipCode,
    private val insertCustomer: InsertCustomer
) : InsertCustomerUseCase {

    override fun insert(customer: Customer, zipCode: String) {
        var address = findAddressByZipCode.find(zipCode)
        customer.address = address

        insertCustomer.insert(customer)
    }
}
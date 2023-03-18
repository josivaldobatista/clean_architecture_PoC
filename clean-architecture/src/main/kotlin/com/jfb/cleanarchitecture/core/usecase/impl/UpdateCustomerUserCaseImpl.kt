package com.jfb.cleanarchitecture.core.usecase.impl

import com.jfb.cleanarchitecture.core.dataprovider.FindAddressByZipCode
import com.jfb.cleanarchitecture.core.dataprovider.UpdateCustomer
import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.core.usecase.FindCustomerByIdUseCase
import com.jfb.cleanarchitecture.core.usecase.UpdateCustomerUserCase

class UpdateCustomerUserCaseImpl(
    private val findCustomerByIdUseCase: FindCustomerByIdUseCase,
    private val findAddressByZipCode: FindAddressByZipCode,
    private val updateCustomer: UpdateCustomer
): UpdateCustomerUserCase {

    override fun update(customer: Customer, zipCode: String) {
        findCustomerByIdUseCase.find(customer.id)
        val address = findAddressByZipCode.find(zipCode)

        customer.address = address
        updateCustomer.update(customer)

    }
}
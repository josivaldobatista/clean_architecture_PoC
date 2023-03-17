package com.jfb.cleanarchitecture.core.usecase

import com.jfb.cleanarchitecture.core.domain.Customer

interface InsertCustomerUseCase {

    fun insert(customer: Customer, zipCode: String)
}
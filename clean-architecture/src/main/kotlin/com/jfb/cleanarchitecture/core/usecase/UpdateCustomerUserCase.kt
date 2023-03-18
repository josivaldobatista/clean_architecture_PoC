package com.jfb.cleanarchitecture.core.usecase

import com.jfb.cleanarchitecture.core.domain.Customer

interface UpdateCustomerUserCase {

    fun update(customer: Customer, zipCode: String)
}
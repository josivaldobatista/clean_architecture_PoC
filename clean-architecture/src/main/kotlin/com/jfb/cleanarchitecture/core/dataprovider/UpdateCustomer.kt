package com.jfb.cleanarchitecture.core.dataprovider

import com.jfb.cleanarchitecture.core.domain.Customer

interface UpdateCustomer {

    fun update(customer: Customer)
}
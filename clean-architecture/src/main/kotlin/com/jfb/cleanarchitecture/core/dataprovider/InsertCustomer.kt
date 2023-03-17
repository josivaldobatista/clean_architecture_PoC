package com.jfb.cleanarchitecture.core.dataprovider

import com.jfb.cleanarchitecture.core.domain.Customer

interface InsertCustomer {

    fun insert(customer: Customer)
}
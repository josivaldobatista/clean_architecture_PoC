package com.jfb.cleanarchitecture.core.dataprovider

import com.jfb.cleanarchitecture.core.domain.Customer
import java.util.Optional

interface FindCustomerById {

    fun find(id: String?): Optional<Customer>
}
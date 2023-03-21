package com.jfb.cleanarchitecture.core.usecase

import com.jfb.cleanarchitecture.core.domain.Customer

interface FindCustomerByIdUseCase {

    fun find(id: String?): Customer
}
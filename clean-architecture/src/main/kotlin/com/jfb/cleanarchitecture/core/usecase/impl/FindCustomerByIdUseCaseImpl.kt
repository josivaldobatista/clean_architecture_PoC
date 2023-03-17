package com.jfb.cleanarchitecture.core.usecase.impl

import com.jfb.cleanarchitecture.core.dataprovider.FindCustomerById
import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.core.exception.NotFoundException
import com.jfb.cleanarchitecture.core.usecase.FindCustomerByIdUseCase

class FindCustomerByIdUseCaseImpl(
    private val findCustomerById: FindCustomerById
): FindCustomerByIdUseCase {

    override fun find(id: String): Customer {
        return findCustomerById.find(id).orElseThrow {
            NotFoundException("Customer not found", "ERROR_CA001")
        }
    }
}
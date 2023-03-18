package com.jfb.cleanarchitecture.core.usecase.impl

import com.jfb.cleanarchitecture.core.dataprovider.DeleteCustomerById
import com.jfb.cleanarchitecture.core.usecase.DeleteCustomerByIdUseCase
import com.jfb.cleanarchitecture.core.usecase.FindCustomerByIdUseCase

class DeleteCustomerByIdUseCaseImpl(
    private val findCustomerByIdUseCase: FindCustomerByIdUseCase,
    private val deleteCustomerById: DeleteCustomerById
): DeleteCustomerByIdUseCase {

    override fun delete(id: String) {
        findCustomerByIdUseCase.find(id)
        deleteCustomerById.delete(id)
    }
}
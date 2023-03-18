package com.jfb.cleanarchitecture.dataprovider

import com.jfb.cleanarchitecture.core.dataprovider.DeleteCustomerById
import com.jfb.cleanarchitecture.dataprovider.repository.CustomerRepository
import org.springframework.stereotype.Component

@Component
class DeleteCustomerByIdImpl(
    private val customerRepository: CustomerRepository
): DeleteCustomerById {

    override fun delete(id: String) {
        customerRepository.deleteById(id)
    }
}
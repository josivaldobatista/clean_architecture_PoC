package com.jfb.cleanarchitecture.dataprovider

import com.jfb.cleanarchitecture.core.dataprovider.UpdateCustomer
import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.dataprovider.repository.CustomerRepository
import com.jfb.cleanarchitecture.dataprovider.repository.mapper.CustomerEntityMapper
import org.springframework.stereotype.Component

@Component
class UpdateCustomerImpl(
    private val customerRepository: CustomerRepository,
    private val customerEntityMapper: CustomerEntityMapper
): UpdateCustomer {

    override fun update(customer: Customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer)
        customerRepository.save(customerEntity)
    }
}
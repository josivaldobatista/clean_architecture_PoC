package com.jfb.cleanarchitecture.dataprovider

import com.jfb.cleanarchitecture.core.dataprovider.InsertCustomer
import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.dataprovider.repository.CustomerRepository
import com.jfb.cleanarchitecture.dataprovider.repository.mapper.CustomerEntityMapper
import org.springframework.stereotype.Component

@Component
class InsertCustomerImpl(
    private val customerRepository: CustomerRepository,
    private val customerEntityMapper: CustomerEntityMapper
): InsertCustomer {

    override fun insert(customer: Customer) {
        val customerEntity = customerEntityMapper.toCustomerEntity(customer)
        customerRepository.save(customerEntity)
    }
}
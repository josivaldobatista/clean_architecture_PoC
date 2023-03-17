package com.jfb.cleanarchitecture.dataprovider

import com.jfb.cleanarchitecture.core.dataprovider.FindCustomerById
import com.jfb.cleanarchitecture.core.domain.Customer
import com.jfb.cleanarchitecture.dataprovider.repository.CustomerRepository
import com.jfb.cleanarchitecture.dataprovider.repository.mapper.CustomerEntityMapper
import org.springframework.stereotype.Component
import java.util.*

@Component
class FindCustomerByIdImpl(
    private val customerRepository: CustomerRepository,
    private val customerEntityMapper: CustomerEntityMapper
): FindCustomerById {

    override fun find(id: String): Optional<Customer> {
        var customerEntity = customerRepository.findById(id)
        return customerEntity.map { entity -> customerEntityMapper.toCustomer(entity) }
    }
}
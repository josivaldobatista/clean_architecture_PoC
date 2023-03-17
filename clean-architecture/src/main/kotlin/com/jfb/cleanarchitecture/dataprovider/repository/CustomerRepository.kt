package com.jfb.cleanarchitecture.dataprovider.repository

import com.jfb.cleanarchitecture.dataprovider.repository.entity.CustomerEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: MongoRepository<CustomerEntity, String>
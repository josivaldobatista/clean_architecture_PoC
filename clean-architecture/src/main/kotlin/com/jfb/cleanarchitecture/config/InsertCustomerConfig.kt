package com.jfb.cleanarchitecture.config

import com.jfb.cleanarchitecture.core.usecase.impl.InsertCustomerUseCaseImpl
import com.jfb.cleanarchitecture.dataprovider.FindAddressByZipCodeImpl
import com.jfb.cleanarchitecture.dataprovider.InsertCustomerImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomerUseCase(
        findAddressByZipCodeImpl: FindAddressByZipCodeImpl,
        insertCustomerImpl: InsertCustomerImpl
    ): InsertCustomerUseCaseImpl {
        return InsertCustomerUseCaseImpl(
            findAddressByZipCodeImpl, insertCustomerImpl
        )
    }
}
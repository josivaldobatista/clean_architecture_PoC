package com.jfb.cleanarchitecture.config

import com.jfb.cleanarchitecture.core.usecase.impl.InsertCustomerUseCaseImpl
import com.jfb.cleanarchitecture.dataprovider.FindAddressByZipCodeImpl
import com.jfb.cleanarchitecture.dataprovider.InsertCustomerImpl
import com.jfb.cleanarchitecture.dataprovider.SendCpfForValidationImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomerUseCase(
        findAddressByZipCodeImpl: FindAddressByZipCodeImpl,
        insertCustomerImpl: InsertCustomerImpl,
        sendCpfForValidationImpl: SendCpfForValidationImpl
    ): InsertCustomerUseCaseImpl {
        return InsertCustomerUseCaseImpl(
            findAddressByZipCodeImpl, insertCustomerImpl, sendCpfForValidationImpl
        )
    }
}
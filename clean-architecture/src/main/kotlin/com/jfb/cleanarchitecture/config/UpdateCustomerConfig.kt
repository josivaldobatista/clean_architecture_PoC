package com.jfb.cleanarchitecture.config

import com.jfb.cleanarchitecture.core.usecase.impl.FindCustomerByIdUseCaseImpl
import com.jfb.cleanarchitecture.core.usecase.impl.UpdateCustomerUserCaseImpl
import com.jfb.cleanarchitecture.dataprovider.FindAddressByZipCodeImpl
import com.jfb.cleanarchitecture.dataprovider.UpdateCustomerImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {

    @Bean
    fun updateCustomerUseCase(
        findCustomerByIdUseCaseImpl: FindCustomerByIdUseCaseImpl,
        findAddressByZipCodeImpl: FindAddressByZipCodeImpl,
        updateCustomerImpl: UpdateCustomerImpl
    ): UpdateCustomerUserCaseImpl {
        return UpdateCustomerUserCaseImpl(
            findCustomerByIdUseCaseImpl,
            findAddressByZipCodeImpl,
            updateCustomerImpl
        )

    }
}
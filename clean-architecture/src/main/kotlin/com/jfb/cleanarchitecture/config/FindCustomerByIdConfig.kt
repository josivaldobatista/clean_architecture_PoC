package com.jfb.cleanarchitecture.config

import com.jfb.cleanarchitecture.core.usecase.impl.FindCustomerByIdUseCaseImpl
import com.jfb.cleanarchitecture.dataprovider.FindCustomerByIdImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {

    @Bean
    fun findCustomerUseCase(
        findCustomerByIdImpl: FindCustomerByIdImpl
    ): FindCustomerByIdUseCaseImpl {
        return FindCustomerByIdUseCaseImpl(
            findCustomerByIdImpl
        )
    }
}
package com.jfb.cleanarchitecture.config

import com.jfb.cleanarchitecture.core.usecase.impl.DeleteCustomerByIdUseCaseImpl
import com.jfb.cleanarchitecture.core.usecase.impl.FindCustomerByIdUseCaseImpl
import com.jfb.cleanarchitecture.dataprovider.DeleteCustomerByIdImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerByIdConfig {

    @Bean
    fun deleteCustomerByIdConfigUseCase(
        findCustomerByIdUseCaseImpl: FindCustomerByIdUseCaseImpl,
        deleteCustomerByIdImpl: DeleteCustomerByIdImpl
    ): DeleteCustomerByIdUseCaseImpl {
        return DeleteCustomerByIdUseCaseImpl(
            findCustomerByIdUseCaseImpl,
            deleteCustomerByIdImpl
        )
    }
}
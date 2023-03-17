package com.jfb.cleanarchitecture.entrypoint.controller

import com.jfb.cleanarchitecture.core.usecase.InsertCustomerUseCase
import com.jfb.cleanarchitecture.entrypoint.controller.mapper.CustomerMapper
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val insertCustomerUseCase: InsertCustomerUseCase,
    private val customerMapper: CustomerMapper
) {

    @PostMapping
    fun insert(
        @Valid @RequestBody customerRequest: CustomerRequest
    ): ResponseEntity<Void> {
        var customer = customerMapper.toCustomer(customerRequest)
        insertCustomerUseCase.insert(customer, customerRequest.zipCode)
        return ResponseEntity.ok().build()
    }

}
package com.jfb.cleanarchitecture.entrypoint.controller

import com.jfb.cleanarchitecture.core.usecase.FindCustomerByIdUseCase
import com.jfb.cleanarchitecture.core.usecase.InsertCustomerUseCase
import com.jfb.cleanarchitecture.entrypoint.controller.mapper.CustomerMapper
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest
import com.jfb.cleanarchitecture.entrypoint.controller.response.CustomerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val insertCustomerUseCase: InsertCustomerUseCase,
    private val findCustomerByIdUseCase: FindCustomerByIdUseCase,
    private val customerMapper: CustomerMapper
) {

    @PostMapping
    fun insert(
        @Valid @RequestBody customerRequest: CustomerRequest
    ): ResponseEntity<Void> {
        val customer = customerMapper.toCustomer(customerRequest)
        insertCustomerUseCase.insert(customer, customerRequest.zipCode)
        return ResponseEntity.ok().build()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<CustomerResponse> {
        val customer = findCustomerByIdUseCase.find(id)
        val customerResponse = customerMapper.toCustomerResponse(customer)
        return ResponseEntity.ok().body(customerResponse)
    }


}
package com.jfb.cleanarchitecture.entrypoint.controller

import com.jfb.cleanarchitecture.core.usecase.DeleteCustomerByIdUseCase
import com.jfb.cleanarchitecture.core.usecase.FindCustomerByIdUseCase
import com.jfb.cleanarchitecture.core.usecase.InsertCustomerUseCase
import com.jfb.cleanarchitecture.core.usecase.UpdateCustomerUserCase
import com.jfb.cleanarchitecture.entrypoint.controller.mapper.CustomerMapper
import com.jfb.cleanarchitecture.entrypoint.controller.mapper.toCustomer
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest
import com.jfb.cleanarchitecture.entrypoint.controller.response.CustomerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val insertCustomerUseCase: InsertCustomerUseCase,
    private val findCustomerByIdUseCase: FindCustomerByIdUseCase,
    private val updateCustomerUserCase: UpdateCustomerUserCase,
    private val deleteCustomerByIdUseCase: DeleteCustomerByIdUseCase,
    private val customerMapper: CustomerMapper
) {

    @PostMapping
    fun insert(
        @Valid @RequestBody customerRequest: CustomerRequest
    ): ResponseEntity<Void> {
        val customer = customerRequest.toCustomer()
        insertCustomerUseCase.insert(customer, customerRequest.zipCode)
        return ResponseEntity.ok().build()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String): ResponseEntity<CustomerResponse> {
        val customer = findCustomerByIdUseCase.find(id)
        val customerResponse = customerMapper.toCustomerResponse(customer)
        return ResponseEntity.ok().body(customerResponse)
    }

    @PutMapping("/{id}")
    fun update(
        @PathVariable("id") id: String,
        @Valid @RequestBody customerRequest: CustomerRequest
    ): ResponseEntity<Void> {
        val customer = customerRequest.toCustomer()
        customer.id  = id

        updateCustomerUserCase.update(customer, customerRequest.zipCode)
        return ResponseEntity.noContent().build()
    }

    @DeleteMapping("/{id}")
    fun delete(
        @PathVariable("id") id: String
    ): ResponseEntity<Void> {
        deleteCustomerByIdUseCase.delete(id)
        return ResponseEntity.noContent().build()
    }

}
package com.jfb.cleanarchitecture.core.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(NotFoundException::class)
    fun notFoundException(e: NotFoundException, request: WebRequest): ResponseEntity<ErrorResponse> {
        val error = ErrorResponse(
            HttpStatus.NOT_FOUND.value(),
            e.message,
            e.errorCode,
            null
        )
        return ResponseEntity(error, HttpStatus.NOT_FOUND)
    }
}
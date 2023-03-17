package com.jfb.cleanarchitecture.core.exception

data class ErrorResponse(
    var status: Int,
    var message: String?,
    var internalCode: String,
    var errors: List<FieldErrorResponse>?
)

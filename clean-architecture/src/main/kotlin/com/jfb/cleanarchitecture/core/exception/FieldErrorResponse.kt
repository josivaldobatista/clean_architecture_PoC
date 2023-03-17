package com.jfb.cleanarchitecture.core.exception

data class FieldErrorResponse(
    var message: String,
    var field: String
)
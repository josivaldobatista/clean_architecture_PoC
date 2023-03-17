package com.jfb.cleanarchitecture.core.exception

class NotFoundException(
    override val message: String,
    val errorCode: String
) : Exception()

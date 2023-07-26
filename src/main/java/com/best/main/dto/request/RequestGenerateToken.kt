package com.best.main.dto.request

import java.math.BigDecimal

data class RequestGenerateToken(
        val username: String?,
        val name: String?,
        val clientsCash: BigDecimal?
)

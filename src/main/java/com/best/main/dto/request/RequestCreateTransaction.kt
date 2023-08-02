package com.best.main.dto.request

import com.best.main.enums.Bank
import java.math.BigDecimal

data class RequestCreateTransaction(
        val amount: BigDecimal,
        val token: String,
        val name: String,
        val accountId: Long?,
        val clientIban: String?,
        val clientBank: Bank?,
)
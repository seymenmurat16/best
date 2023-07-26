package com.best.main.dto.request

import com.best.main.enums.PaymentType
import com.best.main.enums.TransactionType
import java.math.BigDecimal

data class RequestGenerateTokenGeneral(
        val username: String?,
        val name: String?,
        val clientsCash: BigDecimal?,
        val clientId: Long,
        val transactionType: TransactionType,
        val paymentType: PaymentType?,
)

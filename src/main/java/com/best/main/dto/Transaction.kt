package com.best.main.dto

import com.best.main.enums.PaymentType
import com.best.main.enums.TransactionStatus
import com.best.main.enums.TransactionType
import java.math.BigDecimal
import java.time.LocalDateTime

data class Transaction(
        val id: Long?,
        val amount: BigDecimal?,
        val updatedAmount: BigDecimal?,
        val type: TransactionType?,
        val paymentType: PaymentType?,
        val status: TransactionStatus?,
        val clientUsername: String?,
        val userTransferName: String?,
        val createTime: LocalDateTime?,
        val updateTime: LocalDateTime?,
        val teamId: Long?,
        val userId: Long?,
        val accountId: Long?,
        val clientId: Long?,
        val withdrawInfoId: Long?
)

package com.best.main.dto

import com.best.main.enums.Bank
import com.best.main.enums.PaymentType
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id: Long,
        val bank: Bank,
        val bankName: String,
        val iban: String,
        val holder: String,
        val paymentType: PaymentType,
        val isActive: Boolean,
        val minAmount: BigDecimal,
        val maxAmount: BigDecimal,
        val createTime: LocalDateTime,
        val updateTime: LocalDateTime?,
)

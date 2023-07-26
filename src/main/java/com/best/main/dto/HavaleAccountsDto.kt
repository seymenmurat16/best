package com.best.main.dto

import com.best.main.enums.Bank
import java.math.BigDecimal

data class HavaleAccountsDto(
        val id: Long,
        val bank: Bank,
        val bankName: String,
        val iban: String,
        val holder: String,
        val minAmount: BigDecimal,
        val maxAmount: BigDecimal,
)

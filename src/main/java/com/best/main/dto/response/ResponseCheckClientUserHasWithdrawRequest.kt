package com.best.main.dto.response

import com.best.main.dto.Transaction

data class ResponseCheckClientUserHasWithdrawRequest(
        val hasWithdrawRequest: Boolean,
        val transaction: Transaction?
)

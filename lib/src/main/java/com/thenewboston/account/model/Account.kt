package com.thenewboston.account.model

import java.math.BigDecimal
import kotlinx.serialization.SerialName

data class Account(
    val id: String,
    @SerialName("account_number")
    val accountNumber: String,
    @SerialName("nick_name")
    val nickName: String,
    @SerialName("signing_key")
    val signingKey: String,
    val balance: BigDecimal,
    @SerialName("balance_lock")
    val balanceLock: String
)

package ru.itmo.tps.dto

import java.util.*

data class TransactionRequest (
    val transactionId: String,
    val clientSecret: UUID
)

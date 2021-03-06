package ru.itmo.tps.dto.management

import java.util.*

data class AccountLimits (
    val id: UUID,

    val acceptTransactions: Boolean,

    val enableResponseTimeVariation: Boolean,
    val responseTimeLowerBound: Long,
    val responseTimeUpperBound: Long,

    val enableFailures: Boolean,
    val failureProbability: Double,

    val enableRateLimits: Boolean,
    val requestsPerSecond: Long,
    val requestsPerMinute: Long,
    val requestsPerHour: Long,
    val requestsPerDay: Long,

    val enableServerErrors: Boolean,
    val serverErrorProbability: Double
)
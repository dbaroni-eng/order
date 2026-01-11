package com.dbaroni.order.presentation.dto

import com.dbaroni.order.infrastructure.util.Money

data class CreateOrderRequest(
    val amount: Money,
    val description: String
)

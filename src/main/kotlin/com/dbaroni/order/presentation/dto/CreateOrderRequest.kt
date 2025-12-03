package com.dbaroni.order.presentation.dto

data class CreateOrderRequest(
    val amount: Int,
    val description: String
)

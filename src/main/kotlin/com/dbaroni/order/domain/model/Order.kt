package com.dbaroni.order.domain.model

import java.util.UUID

data class Order(
    val id: UUID?,
    val amount: Int,
    val description: String,
    val status: OrderStatus?
)

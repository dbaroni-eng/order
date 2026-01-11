package com.dbaroni.order.domain.model

import com.dbaroni.order.infrastructure.util.Money
import java.util.UUID

data class Order(
    val id: UUID?,
    val amount: Money,
    val description: String,
    val status: OrderStatus?
)

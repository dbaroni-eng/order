package com.dbaroni.order.presentation.dto

import com.dbaroni.order.domain.model.Order
import com.dbaroni.order.domain.model.OrderStatus
import java.util.UUID

data class OrderResponse(
    val id: UUID,
    val amount: Int,
    val description: String,
    val status: String
) {
    companion object {
        fun from(order: Order) = OrderResponse(
            id = order.id!!,
            amount = order.amount,
            description = order.description,
            status = order.status?.name ?: OrderStatus.PENDING.name
        )
    }
}
package com.dbaroni.order.domain.repository

import com.dbaroni.order.domain.model.Order
import java.util.UUID

interface OrderRepository {
    fun save(order: Order): Order

    fun findById(id: UUID): Order?
}

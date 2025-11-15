package com.dbaroni.order.domain.repository

import com.dbaroni.order.domain.model.Order

interface OrderRepository {
    fun save(order: Order): Order
}
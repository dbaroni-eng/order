package com.dbaroni.order.domain.service

import com.dbaroni.order.domain.model.Order

class OrderService {
    fun validate(order: Order): Boolean {
        return order.amount > 0
    }
}
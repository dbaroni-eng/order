package com.dbaroni.order.domain.repository

import com.dbaroni.order.domain.model.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface OrderRepository : JpaRepository<Order, UUID> {
    fun save(order: Order): Order
}
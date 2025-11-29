package com.dbaroni.order.application

import com.dbaroni.order.domain.model.Order
import com.dbaroni.order.domain.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class CreateOrderUseCase(private val repository: OrderRepository) {

    fun execute(order: Order): Order {
        return repository.save(order)
    }
}
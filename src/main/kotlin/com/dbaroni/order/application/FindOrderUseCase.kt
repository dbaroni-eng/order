package com.dbaroni.order.application

import com.dbaroni.order.domain.model.Order
import com.dbaroni.order.domain.repository.OrderRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class FindOrderUseCase(private val repository: OrderRepository) {
    fun execute(id: UUID): Order? {
        return repository.findById(id)
    }
}

package com.dbaroni.order.infrastructure.persistence

import com.dbaroni.order.domain.model.Order
import com.dbaroni.order.domain.repository.OrderRepository
import com.dbaroni.order.infrastructure.persistence.mapper.OrderMapper
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class OrderRepositoryImpl(private val springDataOrderRepository: SpringDataOrderRepository) : OrderRepository {
    override fun save(order: Order): Order {
        val entity = OrderMapper.toEntity(order)
        val saved = springDataOrderRepository.save(entity)
        return OrderMapper.toModel(saved)
    }

    override fun findById(id: UUID): Order? {
        return springDataOrderRepository.findById(id).map { OrderMapper.toModel(it) }.orElse(null)
    }
}
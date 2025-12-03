package com.dbaroni.order.infrastructure.persistence

import com.dbaroni.order.infrastructure.persistence.entity.OrderEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface SpringDataOrderRepository : JpaRepository<OrderEntity, UUID>

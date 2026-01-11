package com.dbaroni.order.infrastructure.persistence.mapper

import com.dbaroni.order.domain.model.Order
import com.dbaroni.order.domain.model.OrderStatus
import com.dbaroni.order.infrastructure.persistence.entity.OrderEntity
import com.dbaroni.order.presentation.dto.CreateOrderRequest
import java.time.OffsetDateTime
import java.util.UUID

object OrderMapper {
    fun toEntity(order: Order): OrderEntity =
        OrderEntity(
            id = order.id ?: UUID.randomUUID(),
            amount = order.amount,
            description = order.description,
            createdAt = OffsetDateTime.now(),
            status = order.status?.name ?: OrderStatus.PENDING.name,
        )

    fun toModel(entity: OrderEntity): Order =
        Order(
            id = entity.id,
            amount = entity.amount,
            description = entity.description,
            status = OrderStatus.valueOf(entity.status),
        )

    fun CreateOrderRequest.toDomain(): Order =
        Order(
            id = null,
            amount = amount,
            description = description,
            status = null,
        )
}

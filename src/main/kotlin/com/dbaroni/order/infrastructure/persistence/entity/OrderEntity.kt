package com.dbaroni.order.infrastructure.persistence.entity

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import java.time.OffsetDateTime
import java.util.UUID

@Entity
data class OrderEntity(
    @Id
    val id: UUID = UUID.randomUUID(),
    val amount: Int,
    val description: String,
    val createdAt: OffsetDateTime,
    @Enumerated(EnumType.STRING)
    val status: OrderStatus
)

enum class OrderStatus {
    PENDING, COMPLETED
}

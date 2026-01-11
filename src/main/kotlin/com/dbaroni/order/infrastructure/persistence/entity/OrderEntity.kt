package com.dbaroni.order.infrastructure.persistence.entity

import com.dbaroni.order.infrastructure.util.Money
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.OffsetDateTime
import java.util.UUID

@Entity
data class OrderEntity(
    @Id
    val id: UUID = UUID.randomUUID(),
    val amount: Money,
    val description: String,
    val createdAt: OffsetDateTime,
    val status: String
)

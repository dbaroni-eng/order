package com.dbaroni.order.infrastructure.persistence.entity

import jakarta.persistence.Entity
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
    val status: String
)

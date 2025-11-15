package com.dbaroni.order.infrastructure.persistence.entity

import java.time.OffsetDateTime
import java.util.UUID
import javax.management.Descriptor

data class OrderEntity(
    val id: UUID?,
    val amount: Int,
    val descriptor: Descriptor,
    val dueDate: OffsetDateTime,
    val createdAt: OffsetDateTime,
    @Enumerated(EnumType.STRING)
    val status: PaymentStatus
)

enum class PaymentStatus {
    PENDING, COMPLETED, FAILED
}

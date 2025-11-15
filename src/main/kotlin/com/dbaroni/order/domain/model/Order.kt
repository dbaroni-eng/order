package com.dbaroni.order.domain.model

import java.time.OffsetDateTime
import javax.management.Descriptor

data class Order(
    val amount: Int,
    val descriptor: Descriptor,
    val dueDate: OffsetDateTime
)
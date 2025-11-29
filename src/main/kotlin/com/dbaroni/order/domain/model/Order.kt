package com.dbaroni.order.domain.model

import javax.management.Descriptor

data class Order(
    val amount: Int,
    val descriptor: Descriptor
)
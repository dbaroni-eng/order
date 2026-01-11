package com.dbaroni.order.infrastructure.util

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

@JvmInline
value class Money @JsonCreator constructor(
    @JsonValue val value: Long
)
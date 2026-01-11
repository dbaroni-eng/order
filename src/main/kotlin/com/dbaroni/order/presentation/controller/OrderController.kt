package com.dbaroni.order.presentation.controller

import com.dbaroni.order.application.CreateOrderUseCase
import com.dbaroni.order.application.FindOrderUseCase
import com.dbaroni.order.infrastructure.persistence.mapper.OrderMapper.toDomain
import com.dbaroni.order.presentation.dto.CreateOrderRequest
import com.dbaroni.order.presentation.dto.OrderResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.util.UUID

@RestController
@RequestMapping("/v1/orders")
class OrderController(
    private val createOrderUseCase: CreateOrderUseCase,
    private val findOrderUseCase: FindOrderUseCase
) {
    @PostMapping
    fun create(
        @RequestBody request: CreateOrderRequest
    ): ResponseEntity<OrderResponse> {
        val saved = createOrderUseCase.execute(request.toDomain())
        val location =
            ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saved.id)
                .toUri()
        return ResponseEntity.created(location).build()
    }

    @GetMapping("/{id}")
    fun findById(
        @PathVariable id: UUID
    ): ResponseEntity<OrderResponse> {
        val order = findOrderUseCase.execute(id)
        return if (order != null) {
            ResponseEntity.ok(OrderResponse.from(order))
        } else {
            ResponseEntity.notFound().build()
        }
    }
}

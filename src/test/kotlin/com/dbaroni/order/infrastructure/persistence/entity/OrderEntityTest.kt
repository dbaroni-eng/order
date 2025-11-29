package com.dbaroni.order.infrastructure.persistence.entity

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.OffsetDateTime
import java.util.UUID

class OrderEntityTest {
    var orderId: UUID = UUID.randomUUID()
    var orderCreationDate: OffsetDateTime = OffsetDateTime.now()
    lateinit var order: OrderEntity

    @BeforeEach
    fun setUp() {
        order = OrderEntity(orderId, 10000, "Teste", orderCreationDate, OrderStatus.PENDING)
    }

    @Test
    fun `should have the same ID`() {
        assertEquals(orderId, order.id)
    }

    @Test
    fun `should have the same amount`() {
        assertEquals(10000, order.amount)
    }

    @Test
    fun `should have the same description`() {
        assertEquals("Teste", order.description)
    }

    @Test
    fun `should have the same creation date`() {
        assertEquals(orderCreationDate, order.createdAt)
    }

    @Test
    fun `should have the same creation STATUS`() {
        assertEquals(OrderStatus.PENDING, order.status)
    }

    @Test
    fun `should have a different ID`() {
        val newOrder = order.copy(id = UUID.randomUUID())
        assertNotEquals(newOrder.id, order.id)
    }
}
package com.example.calc

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

import com.example.calc.data.CalculatorImpl
import com.example.calc.domain.Calculator

class CalculatorTest {
    private val calc: Calculator = CalculatorImpl()

    @Test
    fun testAdd() {
        assertEquals(5.0, calc.add(2.0, 3.0))
    }

    @Test
    fun testSubtract() {
        assertEquals(1.0, calc.subtract(3.0, 2.0))
    }

    @Test
    fun testMultiply() {
        assertEquals(6.0, calc.multiply(2.0, 3.0))
    }

    @Test
    fun testDivide() {
        assertEquals(2.0, calc.divide(6.0, 3.0))
        assertFailsWith<IllegalArgumentException> { calc.divide(1.0, 0.0) }
    }
}

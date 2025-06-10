package com.example.calc.data

import com.example.calc.domain.Calculator

/**
 * Default implementation of [Calculator] used across platforms.
 */
class CalculatorImpl : Calculator {
    override fun add(a: Double, b: Double) = a + b

    override fun subtract(a: Double, b: Double) = a - b

    override fun multiply(a: Double, b: Double) = a * b

    override fun divide(a: Double, b: Double): Double {
        require(b != 0.0) { "Division by zero" }
        return a / b
    }
}

package com.example.calc.domain

/**
 * Contract that defines the available calculator operations.
 */
interface Calculator {
    fun add(a: Double, b: Double): Double
    fun subtract(a: Double, b: Double): Double
    fun multiply(a: Double, b: Double): Double
    fun divide(a: Double, b: Double): Double
}

package com.example.androidcalc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calc.data.CalculatorImpl
import com.example.calc.domain.Calculator

class MainActivity : AppCompatActivity() {
    private lateinit var display: TextView
    private val calc: Calculator = CalculatorImpl()
    private var operand: Double? = null
    private var pendingOperation: ((Double, Double) -> Double)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.resultText)

        val digitIds = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btnDot
        )
        digitIds.forEach { id ->
            findViewById<Button>(id).setOnClickListener {
                appendDigit((it as Button).text.toString())
            }
        }

        findViewById<Button>(R.id.btnAdd).setOnClickListener { setOperation(calc::add) }
        findViewById<Button>(R.id.btnSubtract).setOnClickListener { setOperation(calc::subtract) }
        findViewById<Button>(R.id.btnMultiply).setOnClickListener { setOperation(calc::multiply) }
        findViewById<Button>(R.id.btnDivide).setOnClickListener { setOperation(calc::divide) }

        findViewById<Button>(R.id.btnEqual).setOnClickListener { performEquals() }
        findViewById<Button>(R.id.btnClear).setOnClickListener { clearAll() }
    }

    private fun appendDigit(digit: String) {
        if (display.text == "0" && digit != ".") {
            display.text = digit
        } else {
            display.append(digit)
        }
    }

    private fun setOperation(operation: (Double, Double) -> Double) {
        val value = display.text.toString().toDoubleOrNull() ?: return
        if (operand == null) {
            operand = value
        } else {
            operand = pendingOperation?.invoke(operand!!, value) ?: value
            display.text = operand.toString()
        }
        pendingOperation = operation
        display.text = "0"
    }

    private fun performEquals() {
        val value = display.text.toString().toDoubleOrNull() ?: return
        operand?.let { op1 ->
            val result = pendingOperation?.invoke(op1, value) ?: value
            display.text = result.toString()
            operand = null
            pendingOperation = null
        }
    }

    private fun clearAll() {
        display.text = "0"
        operand = null
        pendingOperation = null
    }
}

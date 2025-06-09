package com.example.androidcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.calc.Calculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calc = Calculator()
        val result = calc.add(2.0, 3.0)
        findViewById<TextView>(R.id.resultText).text = "2 + 3 = $result"
    }
}

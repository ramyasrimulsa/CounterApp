package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //  Fixed: Type declaration removed
        setContentView(R.layout.activity_main)

        val counterTextView = findViewById<TextView>(R.id.counterTextView)
        val incrementButton = findViewById<Button>(R.id.incrementButton)

        incrementButton.setOnClickListener {
            count++
            counterTextView.text = count.toString()
        }
    }
}

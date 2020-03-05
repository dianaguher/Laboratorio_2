package com.example.laboratorio_2

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)


        val intent = intent
        val message = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.display_message)
        textView.text = message
    }
}

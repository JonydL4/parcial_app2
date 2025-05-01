package com.example.parcial25_04_2025

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnComenzar = findViewById<Button>(R.id.irComienza)
        val txtRegistrar = findViewById<TextView>(R.id.registrate)

        btnComenzar.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        txtRegistrar.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }
}
package com.example.parcial25_04_2025

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.splash)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Transición a la siguiente activitie despues de 5s
        Handler(Looper.getMainLooper()).postDelayed({
            //Creo el intent para la siguiente activitie
            val intent = Intent(this, home::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)

            //Para finalizar la actividad para que al presionar atras no se devuelva
            finish()
        }, 5000) //5000 milisegundos  que son 5 segundos
    }
}

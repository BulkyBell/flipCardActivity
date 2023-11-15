package com.example.flipcardactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /*
    todo
    Usar drawerLayout?
    Guardar cartas en una matriz
    si la carta está oculta hacer una constante que sea oculta y muestre imagen default
    Varios tipos de imagenes

     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
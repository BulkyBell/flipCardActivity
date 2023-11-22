package com.example.flipcardactivity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val imagen: ImageView
    var nombre: TextView

    init {
        imagen = view.findViewById(R.drawable.camel_svgrepo_com)
        nombre = view.findViewById(R.id.nombre)
    }
}
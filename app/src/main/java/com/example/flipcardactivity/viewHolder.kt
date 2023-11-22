package com.example.flipcardactivity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val imagen: ImageView

    init {
        imagen = view.findViewById(R.id.imageView) // Asegúrate de que este sea el ID correcto en tu card.xml
    }

    fun bind(card: Card) {
        // Suponiendo que card.item.itemID contiene el nombre del recurso en res/drawable
        val resourceId = itemView.resources.getIdentifier(R.drawable.poker_svgrepo_com.toString(), "drawable", itemView.context.packageName)
        imagen.setImageResource(resourceId)
    }
}


package com.example.flipcardactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorReciclerView(private val elements: ArrayList<Card>) : RecyclerView.Adapter<AdaptadorReciclerView.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val cardImageView: ImageView = view.findViewById(R.id.imageView)

        fun bind(card: Card) {
            cardImageView.setImageResource(card.item.itemID)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentCard = elements[position]
        holder.bind(currentCard)

    }

    override fun getItemCount(): Int {
        return elements.size
    }
}
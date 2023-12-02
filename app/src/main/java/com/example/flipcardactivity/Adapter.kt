package com.example.flipcardactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorReciclerView(private val elements: ArrayList<Card>) : RecyclerView.Adapter<AdaptadorReciclerView.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val cardImageView: ImageView = view.findViewById(R.id.imageView)
        private var isFlipped: Boolean = false

        fun bind(card: Card) {
            when (card.state) {
                State.CLEARED -> cardImageView.setImageResource(card.item.itemID)
                State.HIDDEN -> cardImageView.setImageResource(R.drawable.poker_svgrepo_com)
                State.DISCOVERED -> cardImageView.setImageResource(card.item.itemID)
            }

            cardImageView.setOnClickListener {
                if (card.state == State.CLEARED || card.state == State.HIDDEN) {
                    cardImageView.setImageResource(card.item.itemID)
                    card.state = State.DISCOVERED
                } else {
                    cardImageView.setImageResource(R.drawable.poker_svgrepo_com)
                    card.state = State.CLEARED
                }
            }
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

    fun updateData(newData: ArrayList<Card>) {
        elements.clear()
        elements.addAll(newData)
        notifyDataSetChanged()
    }
}

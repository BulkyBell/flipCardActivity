package com.example.flipcardactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorReciclerView: RecyclerView.Adapter<AdaptadorReciclerView.ViewHolder>(){

    private var elementos = arrayListOf<Card>()
    private var item = R.drawable.bird_svgrepo_com
    init{
        var item1 = Item(R.drawable.bird_svgrepo_com)
        var item2 = Item(R.drawable.camel_svgrepo_com)
        var array = arrayListOf<Card>()
        elementos.add(Card(State.CLEARED, item1))
        elementos.add(Card(State.CLEARED, item1))
        elementos.add(Card(State.CLEARED, item2))
        elementos.add(Card(State.CLEARED, item2))
        elementos.shuffle()
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val cardImageView: ImageView = view.findViewById(R.id.imageView)
        fun bind(card:Card){
            cardImageView.setImageResource(card.item.itemID)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentCard = elementos[position]
        holder.bind(currentCard)
    }
    override fun getItemCount(): Int {
        return this.elementos.size
    }
}
package com.example.flipcardactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorReciclerView: RecyclerView.Adapter<AdaptadorReciclerView.ViewHolder>(){

    private var elementos = arrayListOf<Card>()
    init{
        var item1 = Item(R.drawable.bear_svgrepo_com)
        var item2 = Item(R.drawable.bird_svgrepo_com)
        var item3 = Item(R.drawable.cat_with_wry_smile_svgrepo_com)
        var item4 = Item(R.drawable.camel_svgrepo_com)
        var item6 = Item(R.drawable.dog_face_svgrepo_com)
        var item7 = Item(R.drawable.dolphin_svgrepo_com)
        var item8 = Item(R.drawable.lion_svgrepo_com)
        var item9 = Item(R.drawable.mouse_svgrepo_com)
        elementos.add(Card(State.CLEARED, item1))
        elementos.add(Card(State.CLEARED, item1))
        elementos.add(Card(State.CLEARED, item2))
        elementos.add(Card(State.CLEARED, item2))
        elementos.add(Card(State.CLEARED, item3))
        elementos.add(Card(State.CLEARED, item3))
        elementos.add(Card(State.CLEARED, item4))
        elementos.add(Card(State.CLEARED, item4))
        elementos.add(Card(State.CLEARED, item6))
        elementos.add(Card(State.CLEARED, item6))
        elementos.add(Card(State.CLEARED, item7))
        elementos.add(Card(State.CLEARED, item7))
        elementos.add(Card(State.CLEARED, item8))
        elementos.add(Card(State.CLEARED, item8))
        elementos.add(Card(State.CLEARED, item9))
        elementos.add(Card(State.CLEARED, item9))
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
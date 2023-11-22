package com.example.flipcardactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView

class AdaptadorReciclerView: RecyclerView.Adapter<AdaptadorReciclerView.ViewHolder>(){

    private var elementos:ArrayList<Card>
    private var item = R.drawable.bird_svgrepo_com
    init{
        elementos= ArrayList()
        elementos.add(Card(State.CLEARED, item))
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var item: Card
        init {

            item = view.findViewById(R.drawable.poker_svgrepo_com)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.elementos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item=this.elementos.get(position)
    }


}
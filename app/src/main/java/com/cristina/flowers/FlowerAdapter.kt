package com.cristina.flowers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlowerAdapter (private val flowers: List<Flower>) : RecyclerView.Adapter<FlowerAdapter.FlowerHolder>() {

    class FlowerHolder(private val view: View) : RecyclerView.ViewHolder(view){
        fun onBind(flower: Flower){
            val image = view.findViewById<ImageView>(R.id.image)
            val title = view.findViewById<TextView>(R.id.title)
            val content = view.findViewById<TextView>(R.id.content)

            image.setImageResource(flower.image)
            title.text = flower.title
            content.text = flower.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.card_flowers,parent,false)
        return FlowerHolder(view)
    }

    override fun onBindViewHolder(flowerHolder: FlowerHolder, position: Int) {
        val flower = flowers[position]
        flowerHolder.onBind(flower)
    }

    override fun getItemCount(): Int {
        return flowers.size
    }
}
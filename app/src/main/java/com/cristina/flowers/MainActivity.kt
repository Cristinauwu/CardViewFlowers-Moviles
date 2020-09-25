package com.cristina.flowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val flowerAdapter = FlowerAdapter(createFlowers())

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = flowerAdapter

        flowerAdapter.notifyDataSetChanged()
    }


    fun createFlowers(): List<Flower> {
        val flowers = mutableListOf<Flower>()

        flowers.add(
            Flower(
               R.drawable.ic_oleander,
                "Laurel",
                "También conocida como laurel de flor o trinitaria, es una planta arbustiva con hojas de un verde intenso y altamente venenosas."
            )
        )

        flowers.add(
            Flower(
                R.drawable.ic_margarita,
                "Margarita",
                "Planta herbácea de tallo fuerte, hojas abundantes y flores terminales de centro amarillo y circunferencia blanca."
            )
        )

        flowers.add(
            Flower(
                R.drawable.ic_rosa,
                "Rosa",
                "Flor del rosal, de pétalos grandes en forma de corazón, espinas en el tallo, colores vivos y variados, olor intenso y agradable."
            )
        )

        return flowers

    }
}
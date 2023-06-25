package com.example.rawan_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNames = arrayOf(
            "James", "Joseph", "Art", "Len", "Don", "Sima", "Mitsue",
            "Leo", "Sage", "Krish", "Minna", "Abe", "Kyle", "Graciela",
            "Cammi", "Matt", "Mel", "Glady", "Yukee"
        )

        val lastNames = arrayOf(
            "Bhatt", "Darakjy", "Veere", "Paprocki", "Foller", "Morasca",
            "Toll", "Dilli", "Wiezer", "Marrier", "Amigo", "Maclead",
            "Caldarera", "Roota", "Albares", "Poquette", "Garufi", "Rim",
            "whobrey"
        )

        val fullNames = Array(firstNames.size) { i ->
            "${firstNames[i]} ${lastNames[i]}"
        }

        recyclerView = findViewById(R.id.recyclerView)
        adapter = NameAdapter(firstNames, lastNames, fullNames)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

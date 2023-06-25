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

        // Array of first names
        val firstNameArray = arrayOf(
            "James", "Joseph", "Art", "Len", "Don", "Sima", "Mitsue",
            "Leo", "Sage", "Krish", "Minna", "Abe", "Kyle", "Graciela",
            "Cammi", "Matt", "Mel", "Glady", "Yukee"
        )

        // Array of last names
        val lastNameArray = arrayOf(
            "Bhatt", "Darakjy", "Veere", "Paprocki", "Foller", "Morasca",
            "Toll", "Dilli", "Wiezer", "Marrier", "Amigo", "Maclead",
            "Caldarera", "Roota", "Albares", "Poquette", "Garufi", "Rim",
            "whobrey"
        )

        // Array of full names, combining first and last names
        val fullNameArray = Array(firstNameArray.size) { i ->
            arrayOf(firstNameArray[i], lastNameArray[i], "${firstNameArray[i]} ${lastNameArray[i]}")
        }

        recyclerView = findViewById(R.id.recyclerView)
        adapter = NameAdapter(fullNameArray)

        // Set the adapter for the RecyclerView
        recyclerView.adapter = adapter

        // Set the layout manager for the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

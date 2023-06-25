package com.example.rawan_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter(private val firstNames: Array<String>, private val lastNames: Array<String>, private val fullNames: Array<String>) : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val firstName = firstNames[position]
        val lastName = lastNames[position]
        val fullName = fullNames[position]
        holder.bind(firstName, lastName, fullName)
    }

    override fun getItemCount(): Int {
        return firstNames.size
    }

    inner class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          private val firstNameTextView: TextView = itemView.findViewById(R.id.firstNameTextView)
          private val lastNameTextView: TextView = itemView.findViewById(R.id.lastNameTextView)
          private val fullNameTextView: TextView = itemView.findViewById(R.id.fullNameTextView)

        fun bind(firstName: String, lastName: String, fullName: String) {
            firstNameTextView.text = firstName
            lastNameTextView.text = lastName
            fullNameTextView.text = fullName
        }
    }

}

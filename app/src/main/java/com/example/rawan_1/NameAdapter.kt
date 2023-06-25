package com.example.rawan_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter(private val names: Array<Array<String>>) : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    private val VIEW_TYPE_HEADER = 0
    private val VIEW_TYPE_ITEM = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == VIEW_TYPE_HEADER) {
            // Inflating the header layout for the ViewHolder
            val view = inflater.inflate(R.layout.item_header, parent, false)
            NameViewHolder(view, viewType)
        } else {
            // Inflating the item layout for the ViewHolder
            val view = inflater.inflate(R.layout.item_name, parent, false)
            NameViewHolder(view, viewType)
        }
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        if (holder.viewType == VIEW_TYPE_ITEM) {
            // Binding data to the ViewHolder's views only for item views (not header)
            val name = names[position - 1] // Subtract 1 to account for the header
            holder.bind(name)
        }
    }

    override fun getItemCount(): Int {
        return names.size + 1 // Total count including the header
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            VIEW_TYPE_HEADER // Return header view type for position 0
        } else {
            VIEW_TYPE_ITEM // Return item view type for other positions
        }
    }

    inner class NameViewHolder(itemView: View, val viewType: Int) : RecyclerView.ViewHolder(itemView) {
        private val firstNameTextView: TextView? = itemView.findViewById(R.id.firstNameTextView)
        private val lastNameTextView: TextView? = itemView.findViewById(R.id.lastNameTextView)
        private val fullNameTextView: TextView? = itemView.findViewById(R.id.fullNameTextView)

        // Binds data to the views in the ViewHolder
        fun bind(name: Array<String>) {
            firstNameTextView?.text = name[0] // Set first name
            lastNameTextView?.text = name[1] // Set last name
            fullNameTextView?.text = name[2] // Set full name
        }
    }
}

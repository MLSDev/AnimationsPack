package com.mlsdev.androidanimations

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mlsdev.androidanimations.library.AnimationUtils

class RecyclerViewAdapter(
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_animation, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = AnimationUtils.animationNames.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(onItemClick, AnimationUtils.animationNames[position])
    }

}

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var textView: TextView = view.findViewById(R.id.tv_name)

    fun bind(onItemClick: (String) -> Unit, item: String) {
        textView.text = item
        itemView.setOnClickListener {
            onItemClick.invoke(item)
        }
    }

}
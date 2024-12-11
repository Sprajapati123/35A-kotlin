package com.example.a35a.adapter

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a35a.R

class FruitsAdapter(
    val context: Context,
    val imageList : ArrayList<Int>,
    val titleList : ArrayList<String>,
    val descList : ArrayList<String>,
) {
    class FruitsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image : ImageView = itemView.findViewById(R.id.imageRecycler)
        var title : TextView = itemView.findViewById(R.id.lblTitle)
        var desc : TextView = itemView.findViewById(R.id.lblDescription)
    }
}
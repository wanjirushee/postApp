package com.example.postapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.postapp.R

class postsRecyclerViewAdapter (val postsList:List<String>):
        RecyclerView.Adapter<postsRecyclerViewAdapter.postsViewHolder>
            ()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_name_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return postsList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvData.text = postsList[position]
    }
    class postsViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}
}
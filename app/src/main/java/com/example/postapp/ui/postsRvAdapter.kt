package com.example.postapp.ui

import androidx.recyclerview.widget.RecyclerView
import com.example.postapp.R

class postsRvAdapter (var postsList:List<post>,var postItemClickListener:postItemClickListener)
Recyclerview.Adapter<postsRvAdapter.postsViewAdapter>(){
    override fun onCreateViewHolder(parent,viewGroup,viewType:Int) postsViewHolder{
        var itemView=
            LayoutInFlater.from(parent.context).inflate(R.layout.row_post_item,parent,
            return postsRecyclerViewAdapter.postsViewHolder(itemview)
            )
    }
    override fun onBindViewHolder(holder: postsRecyclerViewAdapter.postsViewHolder, position:Int)
    var post = postsList[position]
    holder.rowView.rvTitle.text=post.title
    holder.rowView.tvBody.text=post.body
    holder.rowView.tvUserId.texxt=post.userId.toString()
}
override fun getItemCount():Int{
    return postsList.size
}
class postsViewHolder(val rowView:view) : RecyclerView.viewHolder(rowView)
}
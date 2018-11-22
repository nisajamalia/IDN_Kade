package com.nisa.idn_kade

import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_item.view.*

class ViewHolder(val view:View) : RecyclerView.ViewHolder(view) {
    fun bindItem(item: FootballItem,listener: (FootballItem)-> Unit){
        itemView.name.text = item.name
        Glide.with(itemView.context).load(item.image).into(itemView.image)

        itemView.setOnClickListener {
            listener(item)
        }
    }
}
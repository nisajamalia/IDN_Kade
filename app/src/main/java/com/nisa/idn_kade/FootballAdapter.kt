package com.nisa.idn_kade

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class FootballAdapter(private val context: Context, private val items: List<FootballItem>,
                      private val listener: (FootballItem) -> Unit) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    //karna jadi kelas dan kelas , nggak perlu kurung kurawal pake kurung biasa ajee..


    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position : Int) {
        holder.bindItem(items[position], listener)

    }
}
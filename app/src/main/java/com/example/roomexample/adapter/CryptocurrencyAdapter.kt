package com.example.roomexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.roomexample.R
import com.example.roomexample.model.CreptoCurrency



class CryptocurrencyAdapter(private val creptoCurrency: List<CreptoCurrency>) : RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>() {

    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(index : CreptoCurrency){
            Glide.with(itemView.context)
                .load(index.images).dontAnimate()
                .into(itemView.findViewById(R.id.iv_name))
            // Setting name of cryptocurrency to TextView
            itemView.findViewById<TextView>(R.id.tv_name).text = index.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount()=
        creptoCurrency.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(creptoCurrency[position])
    }
}
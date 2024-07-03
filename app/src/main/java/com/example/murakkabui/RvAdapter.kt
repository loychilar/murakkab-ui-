package com.example.murakkabui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.murakkabui.models.Rasmlar

class RvAdapter(val context: Context, val list: ArrayList<Rasmlar>, val rvClick: RvClick):RecyclerView.Adapter<RvAdapter.VH> (){
    inner class VH(var itemRv: View):RecyclerView.ViewHolder(itemRv){
        fun onBind(rasmlar: Rasmlar) {
            itemRv.setOnClickListener {

                rvClick.onClick(rasmlar)
            }

            itemRv.findViewById<ImageView>(R.id.itemImgageView).setImageDrawable(ContextCompat.getDrawable(context,rasmlar.rasm!!))
            itemRv.findViewById<TextView>(R.id.itemTextView).text = rasmlar.ismi
            itemRv.findViewById<TextView>(R.id.itemTextView1).text = rasmlar.odamlar
            itemRv.findViewById<TextView>(R.id.itemTextView2).text = rasmlar.kun
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface RvClick{
        fun onClick(rasmlar: Rasmlar)
    }

}
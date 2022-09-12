package com.example.ah_lms.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ah_lms.R
import com.example.ah_lms.dataclass.ahFamily

class AhFamilyAdapter(private val familyList:List<ahFamily>):RecyclerView.Adapter<AhFamilyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.ahfamily_cardlayout,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = familyList[position]
        holder.name.text = currentItem.teamName
    }

    override fun getItemCount(): Int {
       return familyList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val name:TextView = itemView.findViewById(R.id.teamName)
    }
}
package com.example.ah_lms.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ah_lms.R
import com.example.ah_lms.dataclass.myLeave
import android.widget.ImageView

class MyLeaveAdapter(private val leaveList:List<myLeave>):RecyclerView.Adapter<MyLeaveAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.leavehistotycardlayout,parent,false)
        return ViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

      val currentItem = leaveList[position]
        holder.profilImage.setImageResource(currentItem.profileImage)
        holder.heading.text = currentItem.heading

     /*   holder.leaveDate.text = currentItem.dateOfLeave
        holder.leaveType.text = currentItem.typeOfLeave
        holder.leaveDay.text = currentItem.countDay*/
    }

    override fun getItemCount(): Int {
          return leaveList.size
    }



    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){

        val profilImage:ImageView = itemView.findViewById(R.id.item_image)
        val heading:TextView = itemView.findViewById(R.id.item_title)

     /*   val leaveDate:TextView = itemView.findViewById(R.id.dateOfLeave)
        val leaveType:TextView = itemView.findViewById(R.id.paytype)
        val leaveDay :TextView = itemView.findViewById(R.id.dayCount)*/



    }
}
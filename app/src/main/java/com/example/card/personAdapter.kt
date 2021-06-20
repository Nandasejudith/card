package com.example.card

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class personAdapter(var PeopleList:List<PersonDetails>):RecyclerView.Adapter<PeopleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return PeopleViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        var currentPeople = PeopleList.get(position)
        holder.tvName.text = currentPeople.name
        holder.tvPhoneNumber.text = currentPeople.PhoneNumber
        holder.tvEmailAdress.text = currentPeople.EmailAddress
    }

    override fun getItemCount(): Int {
        return PeopleList.size
    }
}










class PeopleViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmailAdress=itemView.findViewById<TextView>(R.id.tvEmailAddress)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)

}
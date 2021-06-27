package com.example.card

import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class personAdapter(var PeopleList:List<PersonDetails>, var context: Context):RecyclerView.Adapter<PeopleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return PeopleViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        var currentPeople = PeopleList.get(position)
        holder.tvName.text = currentPeople.name
        holder.tvPhoneNumber.text = currentPeople.PhoneNumber
        holder.tvEmailAdress.text = currentPeople.EmailAddress
        Picasso
            .get()
            .load(currentPeople.imageUrl)
//            .placeholder.R.id
            .into(holder.imgContact)
        holder.clContact.setOnClickListener {
            var intentt = Intent(context, ViewContactActivity ::class.java)
            //intent.putExtra("name", currentPeople.name )
            context.startActivity(intentt)
        }
    }

    override fun getItemCount(): Int {
        return PeopleList.size
    }
}

class PeopleViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmailAdress=itemView.findViewById<TextView>(R.id.tvEmailAddress)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var imgContact = itemView.findViewById<ImageView>(R.id.imgContacts)
    var clContact = itemView.findViewById<CardView>(R.id.imgContacts)

}
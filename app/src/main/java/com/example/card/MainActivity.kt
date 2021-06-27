package com.example.card

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvCard:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCard=findViewById(R.id.rvCard)
        var Person= listOf(PersonDetails("Judith","0755033582", "judith@gmail.com",imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.vulture.com%2Farticle%2Ftom-and-jerry-movie-review.html&psig=AOvVaw1Icay3Rsu_roc9lJn3STf7&ust=1624637540919000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCPCN8PT8sPECFQAAAAAdAAAAABAV"),
            PersonDetails("Florence","+123456789876","florence@gmail.com", imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.theguardian.com%2Fmedia%2F2014%2Foct%2F17%2Ftom-jerry-eastenders-reunite-bbc-children-in-need&psig=AOvVaw1Icay3Rsu_roc9lJn3STf7&ust=1624637540919000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCPCN8PT8sPECFQAAAAAdAAAAABAb"),
            PersonDetails("Kay","+23456678","kay@gmail.com", imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.theguardian.com%2Fmedia%2F2014%2Foct%2F17%2Ftom-jerry-eastenders-reunite-bbc-children-in-need&psig=AOvVaw1Icay3Rsu_roc9lJn3STf7&ust=1624637540919000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCPCN8PT8sPECFQAAAAAdAAAAABAb")

    )

//        rvContact = findViewById(R.id.rvCard)
//        rvContacts.layoutManager = LinearLayoutManager(baseContext)
//        var contactsAdapter = ContactsRvAdapter(myContacts, baseContext)
//        rvContacts.adapter = contactsAdapter

var personAdapter=personAdapter(Person)
        rvCard.layoutManager=LinearLayoutManager(baseContext)
        rvCard.adapter=personAdapter
}
}
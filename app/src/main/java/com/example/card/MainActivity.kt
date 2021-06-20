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
        var Person= listOf(PersonDetails("Judith","0755033582", "judith@gmail.com"),
            PersonDetails("Florence","+123456789876","florence@gmail.com"),
            PersonDetails("Kay","+23456678","kay@gmail.com")

    )
var personAdapter=personAdapter(Person)
        rvCard.layoutManager=LinearLayoutManager(baseContext)
        rvCard.adapter=personAdapter
}
}
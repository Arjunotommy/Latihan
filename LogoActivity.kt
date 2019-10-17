package com.example.customlistview

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class LogoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById(R.id.listView) as ListView
        var arrLogo: ArrayList<Logo> = ArrayList()
        arrLogo.add(Logo("Facebook","It was founded by Mark Zuckerberg",R.drawable.facebook))
        arrLogo.add(Logo("Youtube"," Youtube was created by Chad Hurley, Steve Chen, and Jawed Karim.",R.drawable.youtube))
        arrLogo.add(Logo("Twitter","Twitter was created in March 2006 by Jack Dorsey, Noah Glass, Biz Stone, and Evan Williams.",R.drawable.twitter))
        arrLogo.add(Logo("Instagram","a photo and video-sharing social networking service owned by Facebook, Inc.",R.drawable.instagram))
        arrLogo.add(Logo("Whatsapp","freeware, cross-platform messaging and Voice over IP (VoIP) service owned by Facebook.",R.drawable.whatsapp))
        arrLogo.add(Logo("Spotify","Developed by a team at Spotify AB, in Stockholm. The company was founded by Daniel Ek.",R.drawable.spotify))

        listView.adapter = CustomAdapter (applicationContext,arrLogo)

    }

}
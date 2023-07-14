package com.example.carlocus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CheapLuxuryActivity : AppCompatActivity() {
    lateinit var informatonD :CardView
    lateinit var verified :CardView
    lateinit var used :CardView
    lateinit var back :CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheap_luxury)

        informatonD = findViewById(R.id.card1D)
        verified = findViewById(R.id.card2D)
        used = findViewById(R.id.card3D)
        back = findViewById(R.id.card4D)

        informatonD.setOnClickListener {
            val myInformation= Intent(this,bestsmallWeb::class.java)
            startActivity(myInformation)
        }

        verified.setOnClickListener {
            val myVerified= Intent(this,bestLuxweb::class.java)
            startActivity(myVerified)
        }

        used.setOnClickListener {
            val myUsed= Intent(this,forSaleweb::class.java)
            startActivity(myUsed)
        }

        back.setOnClickListener{
            val myBack = Intent(this,HomeActivity::class.java)
            startActivity(myBack)
        }
    }
}
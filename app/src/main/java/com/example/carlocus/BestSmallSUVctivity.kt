package com.example.carlocus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class BestSmallSUVctivity : AppCompatActivity() {
    lateinit var infomartionc: CardView
    lateinit var bestlux: CardView
    lateinit var forsale: CardView
    lateinit var back: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_small_suvctivity)

        infomartionc = findViewById(R.id.card1C)
        bestlux = findViewById(R.id.card2C)
        forsale = findViewById(R.id.card3C)
        back = findViewById(R.id.card4C)

        infomartionc.setOnClickListener {
            val myInformation= Intent(this, bestsmallWeb::class.java)
            startActivity(myInformation)
        }

        bestlux.setOnClickListener {
            val myBestlux = Intent(this, bestLuxweb::class.java)
            startActivity(myBestlux)
        }

        forsale.setOnClickListener {
            val myForsale = Intent(this, forSaleweb::class.java)
            startActivity(myForsale)
        }

        back.setOnClickListener{
            val myBack = Intent(this,HomeActivity::class.java)
            startActivity(myBack)
        }
    }
}
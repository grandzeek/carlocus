package com.example.carlocus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SmallSUVActivity : AppCompatActivity() {
    lateinit var information: CardView
    lateinit var bestLux: CardView
    lateinit var forsale: CardView
    lateinit var back: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_small_suvactivity)

        information = findViewById(R.id.card1)
        bestLux = findViewById(R.id.card2)
        forsale = findViewById(R.id.card3)
        back = findViewById(R.id.card4)

        information.setOnClickListener {
            val myInfom = Intent(this, bestsmallWeb::class.java)
            startActivity(myInfom)
        }
        bestLux.setOnClickListener {
            val myBestLux= Intent(this,bestLuxweb::class.java)
            startActivity(myBestLux)
        }
        forsale.setOnClickListener {
            val myForsale= Intent(this,forSaleweb::class.java)
            startActivity(myForsale)
        }
        back.setOnClickListener{
            val myBack = Intent(this,HomeActivity::class.java)
            startActivity(myBack)
        }
    }
}


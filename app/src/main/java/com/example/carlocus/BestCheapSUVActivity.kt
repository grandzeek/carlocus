package com.example.carlocus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class BestCheapSUVActivity : AppCompatActivity() {
    lateinit var infomartion: CardView
    lateinit var bestsuv: CardView
    lateinit var vigo: CardView
    lateinit var back: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_cheap_suvactivity)

        infomartion = findViewById(R.id.card1A)
        bestsuv = findViewById(R.id.card2A)
        vigo = findViewById(R.id.card3A)
        back = findViewById(R.id.card4A)


        infomartion.setOnClickListener{
            val myIfo= Intent(this,bestsmallWeb::class.java)
            startActivity(myIfo)
        }

        bestsuv.setOnClickListener {
            val myBest= Intent(this,bestLuxweb::class.java)
            startActivity(myBest)
        }

        vigo.setOnClickListener{
            val myVigo= Intent(this, forSaleweb::class.java)
            startActivity(myVigo)
        }
        back.setOnClickListener{
           val myBack = Intent(this,HomeActivity::class.java)
            startActivity(myBack)
        }
    }
}
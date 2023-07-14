package com.example.carlocus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class BestLuxurySUVActivity : AppCompatActivity() {
    lateinit var infomartion: CardView
    lateinit var bestsuv: CardView
    lateinit var vigo: CardView
    lateinit var back: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_luxury_suvactivity)

        infomartion = findViewById(R.id.card1B)
        bestsuv = findViewById(R.id.card2B)
        vigo = findViewById(R.id.card3B)
        back = findViewById(R.id.card4B)


        infomartion.setOnClickListener{
            val myInformation= Intent(this, bestsmallWeb::class.java)
            startActivity(myInformation)
        }

        bestsuv.setOnClickListener{
            val myBestSuv= Intent(this, bestLuxweb::class.java)
            startActivity(myBestSuv)
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
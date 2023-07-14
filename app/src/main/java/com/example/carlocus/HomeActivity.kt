package com.example.carlocus

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    lateinit var bestCheapSUV :CardView
    lateinit var bestLuxurySUV :CardView
    lateinit var BestSmallSUV :CardView
    lateinit var cheapSuv :CardView
    lateinit var smallSuv :CardView
    lateinit var logout :CardView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bestLuxurySUV = findViewById(R.id.luxury)
        bestCheapSUV = findViewById(R.id.deals)
        cheapSuv= findViewById(R.id.cheap)
        BestSmallSUV = findViewById(R.id.BestSmallSuv)
        smallSuv = findViewById(R.id.smallSuv)
        logout= findViewById(R.id.logout)

        bestLuxurySUV.setOnClickListener{
            val myBestLuxurySUV =Intent(this,BestLuxurySUVActivity::class.java)
            startActivity(myBestLuxurySUV)
        }

        bestCheapSUV.setOnClickListener{
            val myBestCheapSUV =Intent(this,BestCheapSUVActivity::class.java)
            startActivity(myBestCheapSUV)
        }

        cheapSuv.setOnClickListener{
            val myCheapSUV =Intent(this,CheapLuxuryActivity::class.java)
            startActivity(myCheapSUV)
        }

        BestSmallSUV.setOnClickListener{
            val myBestSmallSUV =Intent(this,BestSmallSUV::class.java)
            startActivity(myBestSmallSUV)
        }

        smallSuv.setOnClickListener{
            val mysmallSUV =Intent(this,SmallSUVActivity::class.java)
            startActivity(mysmallSUV)
        }
        logout.setOnClickListener {
            val mylogout = Intent(this,MainActivity::class.java)
            startActivity(mylogout)
        }
    }
}
package com.example.carlocus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class forSaleweb : AppCompatActivity() {

    lateinit var web:WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_saleweb)

        web = findViewById(R.id.web3)

        web.webViewClient= WebViewClient()
        web.loadUrl("https://www.jamesedition.com/cars")
        web.settings.javaScriptEnabled=true
        web.settings.setSupportZoom(true)
    }
}
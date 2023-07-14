package com.example.carlocus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class bestLuxweb : AppCompatActivity() {
    lateinit var web: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_luxweb)

        web = findViewById(R.id.web2)

        web.webViewClient= WebViewClient()
        web.loadUrl("https://www.jamesedition.com/cars")
        web.settings.javaScriptEnabled=true
        web.settings.setSupportZoom(true)
    }
}
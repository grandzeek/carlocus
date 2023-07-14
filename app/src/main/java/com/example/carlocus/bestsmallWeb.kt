package com.example.carlocus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class bestsmallWeb : AppCompatActivity() {
    lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bestsmall_web)

        web=findViewById(R.id.web1)


        web.webViewClient= WebViewClient()
        web.loadUrl("https://www.usedcars.co.ke/")
        web.settings.javaScriptEnabled=true
        web.settings.setSupportZoom(true)


    }
}
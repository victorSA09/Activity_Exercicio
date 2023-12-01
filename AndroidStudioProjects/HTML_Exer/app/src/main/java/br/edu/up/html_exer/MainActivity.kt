package br.edu.up.html_exer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

import android.annotation.SuppressLint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var webView: WebView = findViewById(R.id.webView)


        val webSettings: WebSettings = webView.getSettings()
        webSettings.javaScriptEnabled = true


        webView.loadUrl("file:///android_asset/arquivoindex.html")


        val jsInterface = JavaScriptInterface(this)
        webView.addJavascriptInterface(jsInterface, "Android")

    }

}



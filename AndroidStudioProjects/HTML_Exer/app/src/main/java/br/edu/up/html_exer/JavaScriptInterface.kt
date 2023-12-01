package br.edu.up.html_exer

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class JavaScriptInterface(private val context: Context) {
    @JavascriptInterface
    fun showToast(message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}

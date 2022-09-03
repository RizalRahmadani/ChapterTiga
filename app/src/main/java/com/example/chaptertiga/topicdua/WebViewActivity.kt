package com.example.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)


        web.loadUrl("https://www.binaracademy.com")
    }
}
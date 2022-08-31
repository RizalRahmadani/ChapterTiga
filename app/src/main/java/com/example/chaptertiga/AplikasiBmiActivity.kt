package com.example.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aplikasi_bmi.*

class AplikasiBmiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplikasi_bmi)
    }
    fun kalkulatorBmi(){
        btnHitung.setOnClickListener {
           var tinggiBadan = textTinggiBadan.text.toString().toInt()
            var beratBadan = textBeratBadan.text.toString().toInt()
            val bmi = beratBadan/ (tinggiBadan/100)*(tinggiBadan/100)

        }
    }
}
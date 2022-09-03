package com.example.chaptertiga.tugastopicsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.chaptertiga.R

class PenjumlahanActivity : AppCompatActivity() {

    lateinit var angka1 : EditText
    lateinit var angka2 : EditText
    lateinit var hasil : Button
    lateinit var textHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.penjumlahan)
        penjumlahan()
    }

    fun penjumlahan(){
        angka1 = findViewById(R.id.inputAngkaSatu)
        angka2 = findViewById(R.id.inputAngkaDua)
        hasil = findViewById(R.id.btnHasil)
        textHasil = findViewById(R.id.textHasil)

        hasil.setOnClickListener {
            var angkaSatu = angka1.text.toString().toInt()
            var angkaDua = angka2.text.toString().toInt()

           var hasilpenjumalah = angkaSatu + angkaDua
            textHasil.text = hasilpenjumalah.toString()

        }

    }
}
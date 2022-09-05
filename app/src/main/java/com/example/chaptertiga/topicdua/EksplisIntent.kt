package com.example.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.activity_eksplis_intent.*

class EksplisIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eksplis_intent)

        ambilData()
        ambilDataBundle()

    }

    //ambil data menggunakan intent
    fun ambilData(){
        var datasatu = intent.getStringExtra("angka1")
        var dataDua = intent.getStringExtra("angka2")
        textAngkaSatu.text = datasatu
        textAngkaDua.text = dataDua
        textHasil.text = datasatu + dataDua
    }

    //ambil data bundle
    fun ambilDataBundle(){
        var bun = intent.extras

        if (bun != null) {
            textAngkaSatu.setText(bun!!.getString("satu"))
            textAngkaDua.setText(bun!!.getString("dua"))
        }
    }



}
package com.example.chaptertiga.tugastopicsatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.activity_home.*

class ActivityHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnKalkulator.setOnClickListener {
            var pindah = Intent(this, AplikasiBmiActivity:: class.java)
            startActivity(pindah)
        }
        btnNilaiAkhirMahasiswa.setOnClickListener {
            var pindah = Intent (this, ActivityNilaiAkhirMahasiswa::class.java)
            startActivity(pindah)
        }
        btnPenjumlahan.setOnClickListener {
            var pindah = Intent(this , PenjumlahanActivity::class.java)
            startActivity(pindah)
        }
    }
}
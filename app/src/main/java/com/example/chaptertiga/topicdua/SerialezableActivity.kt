package com.example.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.activity_serialezable.*

class SerialezableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serialezable)
        ambilDataSerializable()
    }

    fun ambilDataSerializable(){
        var data =intent.getSerializableExtra("datamahasiswa") as MahasiswaSer
        textJurusan.text = data.jurusan
    }
}
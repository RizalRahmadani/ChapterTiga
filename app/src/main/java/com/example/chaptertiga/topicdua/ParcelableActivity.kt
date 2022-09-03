package com.example.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.activity_parcelable.*

class ParcelableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)
        ambilDataParcelable()

    }
    fun ambilDataParcelable(){
        val dataperson = intent.getParcelableExtra("dataperson") as PersonParcelable?
        textPerson.text = dataperson?.nama
        dataperson?.kota
        dataperson?.umur.toString()
    }
}
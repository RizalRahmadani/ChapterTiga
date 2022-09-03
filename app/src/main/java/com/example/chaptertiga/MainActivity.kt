package com.example.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.chaptertiga.tugastopicsatu.PenjumlahanActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnKlik3 : Button
    lateinit var txtHasil2 : TextView
    lateinit var editNama : EditText
    lateinit var buttonsimpan : Button
    lateinit var textNama : TextView
    lateinit var buttonHome : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //pemanggilan id view dari xml
        var btnKlik = findViewById(R.id.btnkliksatu) as Button
        var textHasil = findViewById(R.id.txthasil) as TextView
        var btnKlik2 = findViewById(R.id.btnklikdua) as Button
//        txtHasil2 = findViewById(R.id.txthasil2)

        btnKlik3 = findViewById(R.id.btn3)
        //kasih event onClick
        btnKlik.setOnClickListener{
            textHasil.text = "Halo terimakasih sudah klik button 1"
        }
        btnKlik2.setOnClickListener {
            textHasil.text =" ini Button 2"
        }
        setOnClick()
        saveName()
        intenKeHome()

    }
    fun setOnClick(){
        txtHasil2 = findViewById(R.id.txthasil2)
        btnKlik3.setOnClickListener{
            txtHasil2.text = "ini button 3"
        }
    }
    fun saveName(){
        editNama = findViewById(R.id.inputNama)
        buttonsimpan = findViewById(R.id.btnSimpan)
        textNama = findViewById(R.id.txtnama)

        buttonsimpan.setOnClickListener{
            var nama = editNama.text.toString()
            textNama.text = nama
        }
    }

    fun intenKeHome(){
        buttonHome = findViewById(R.id.btnHome)
        //inten : perpindahan dari 1 activity ke activity lainnya
        buttonHome.setOnClickListener{
            var pindah = Intent(this, PenjumlahanActivity::class.java)
            startActivity(pindah)
        }
    }
}
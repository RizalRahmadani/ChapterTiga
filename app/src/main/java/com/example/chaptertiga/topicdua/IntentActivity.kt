package com.example.chaptertiga.topicdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.activity_aplikasi_bmi.*
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        intentData()
        passingDataSerializable()
        intenBundle()


    }
    fun intentData(){
        // intent ke ExplicitIntent.kt bawa dua data
                btnMenhitung.setOnClickListener{
                    var dataSatu = angkaSatu.text.toString()
                    var dataDua = angkaDua.text.toString()

//          key - value
                    var inten = Intent (this, EksplisIntent::class.java)
                    inten.putExtra("angkasatu", dataSatu)
                    inten.putExtra("angkadua", dataDua)
                    startActivity(inten)

                }
    }


  // cara mengirimkan data menggunakan Bundle()
    fun intenBundle(){

      btnHitung.setOnClickListener {
          var dataSatu = angkaSatu.text.toString()
          var dataDua = angkaDua.text.toString()

          var bundle = Bundle()
          var pindah = Intent(this, EksplisIntent::class.java)
          bundle.putString("satu", dataSatu)
          bundle.putString("dua", dataDua)
          pindah.putExtras(bundle)
          startActivity(pindah)
      }

    }


    fun passingDataSerializable(){
        val intent = Intent(this, SerialezableActivity::class.java)
        var data = MahasiswaSer("rizal","1234","Teknik Informatika")
        intent.putExtra("datamahasiswa", data)
        startActivity(intent)
    }

    fun passingDataParcelable(){
        val intent = Intent(this,ParcelableActivity::class.java)
        var data = PersonParcelable("akmal", 30, "jerman")
        intent.putExtra("dataperson", data)
    }
}
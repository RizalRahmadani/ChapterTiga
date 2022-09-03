package com.example.chaptertiga.tugastopicsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.activity_nilai_akhir_mahasiswa.*

class ActivityNilaiAkhirMahasiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai_akhir_mahasiswa)
        btnHitung.setOnClickListener{
            buttonHitung()
        }
        btnReset.setOnClickListener {
                buttonReset()
        }
    }




    fun totalNilai(tgs: Float, uts: Float, uas: Float): Float{
        return tgs + uts + uas
    }
    fun rataRata(total:Float): Float{
        return total/3
    }
    fun nilaiHuruf(ratarata: Float) : String{
        val nilaiHuruf : String = when(ratarata){
            in 0.0..60.0 -> "E"
            in 61.0..70.0 -> "D"
            in 71.0..80.0 -> "C"
            in 81.0..90.0 -> "B"
            in 91.0..100.0 -> "A"
            else -> "Rata-rata tidak diketahui"
        }
        return nilaiHuruf
    }


    fun cetakData(nama: String, nim: String, uas: String, uts: String, tugas: String){
        textNama.text = nama
        textNIM.text = nim
        textUAS.text = uas
        textUTS.text = uts
        textTugas.text = tugas
    }

    fun cetakNilai(uas: Float, uts: Float, tugas: Float){
        if(tugas in 0.0..100.00 && uts in 0.0..100.0 && uas in 0.0..100.0){
            val total = totalNilai(tugas, uts, uas)
            val rata = rataRata(total)
            val nilaiHuruf = nilaiHuruf(rata)

            textTotal.text = total.toString()
            textRataRata.text = String.format("%.2f", rata)
            textNilaiHuruf.text = nilaiHuruf
            textStatus.text = status(nilaiHuruf)
        }
        else{
            textTotal.text = ""
            textRataRata.text = ""
            textNilaiHuruf.text = ""
            textStatus.text = ""
        }
    }

    fun status(nilai:String):String{

        if(nilai == "A" || nilai == "B" || nilai == "C") return "Lulus"
        else return "Tidak Lulus"
    }

    fun buttonReset(){
        editTextNama.setText("")
        editTextNIM.setText("")
        editTextUAS.setText("")
        editTextUTS.setText("")
        editTextTugas.setText("")

        textNama.text = ""
        textNIM.text = ""
        textUAS.text = ""
        textUTS.text = ""
        textTugas.text = ""
        textTotal.text = ""
        textRataRata.text = ""
        textNilaiHuruf.text = ""
        textStatus.text = ""
    }
    fun buttonHitung(){
        val nama = editTextNama.text.toString()
        val nim = editTextNIM.text.toString()
        val uas = editTextUAS.text.toString()
        val uts = editTextUTS.text.toString()
        val tugas = editTextTugas.text.toString()

        cetakData(nama, nim, uas, uts, tugas)
        cetakNilai(uas.toFloat(), uts.toFloat(), tugas.toFloat())
    }

}
package com.example.chaptertiga.topicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chaptertiga.R
import kotlinx.android.synthetic.main.fragment_tiga.*


class FragmentTiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnKembalifrSatu.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTiga_to_fragmentSatu2)
        }
        btnKembalifrDua.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTiga_to_fragmentDua2)
        }
//          menggambil data dari fragment2
        var getUmur = arguments?.getString("dataUmur")

        //set data umur kedalam textview
        textUmur.text = getUmur
        // membuat pesan pop up pake toast
        Toast.makeText(context,"$getUmur",Toast.LENGTH_SHORT).show()
    }
}
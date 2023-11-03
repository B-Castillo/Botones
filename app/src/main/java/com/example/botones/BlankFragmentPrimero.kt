package com.example.botones

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class BlankFragmentPrimero : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_blank_primero,container,false)


        val btnNavegar=view.findViewById<Button>(R.id.cambioSegundo)
        btnNavegar.setOnClickListener{
            findNavController().navigate(R.id.action_blankFragmentPrimero_to_blankFragmentSegundo)
        }
        return view
    }

}
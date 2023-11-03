package com.example.botones

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class BlankFragmentSegundo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_blank_segundo,container,false)


        val BtnNavegar=view.findViewById<Button>(R.id.cambioTercero)

        BtnNavegar.setOnClickListener{
            findNavController().navigate(R.id.action_blankFragmentSegundo_to_blankFragmentTercero)
        }
        return view
    }

}
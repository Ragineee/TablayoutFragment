package com.example.fragmentwhatsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ContactFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  layoutInflater.inflate(R.layout.contactfragment,container,false)//super.onCreateView(inflater, container, savedInstanceState)
    }


}
package com.example.fragmentwhatsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.callfragment.*
import kotlinx.android.synthetic.main.contactfragment.view.*

class CallFragment :Fragment(){

    fun  fragmentCall(){}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.callfragment,container,false)
        val recyclerAdapter :RecyclerViewAdapter = RecyclerViewAdapter(context)
        view.contactRecycler.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        view.contactRecycler.adapter = recyclerAdapter
        return view  //super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}
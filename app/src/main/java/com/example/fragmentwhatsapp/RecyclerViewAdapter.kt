package com.example.fragmentwhatsapp

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dailogcontact.view.*
import kotlinx.android.synthetic.main.item_contact.view.*

class RecyclerViewAdapter(private val context: Context?): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int =8

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData()

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindData() {
            itemView.contactName.text = "Justin Bieber"
            itemView.contactNumber.text= "9851333225"

            itemView.setOnClickListener {
                showDialog()
//                itemView.dialogg.show
            }

        }
        @SuppressLint("ResourceType")
        private fun showDialog() {
            val dialog: Dialog? = context?.let { Dialog(it) }.also {

//                it?.window
                it?.setContentView(R.layout.dailogcontact)
                it?.setCancelable(true)
                it?.show()

            }
        }



    }

}
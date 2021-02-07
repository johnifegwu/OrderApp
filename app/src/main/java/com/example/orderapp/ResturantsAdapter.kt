package com.example.orderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ResturantsAdapter : RecyclerView.Adapter<(ResturantsAdapter.ViewHolder)>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.a_single_resturant_row, parent, attachToRoot:false)
        return ViewHolder()
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

    }
}
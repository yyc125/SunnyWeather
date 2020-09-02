package com.sunnyweather.android.ui.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.sunnyweather.android.R
import com.sunnyweather.android.logic.model.Place
import kotlinx.android.synthetic.main.place_item.view.*

/**
Create by yyc
on 2020/9/2 10:50

 */
class PlaceAdapter(private val fragment: Fragment, private val placesList:List<Place>)
    :RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){

  inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
      val placesName:TextView=view.findViewById(R.id.placeName)
      val placesAddress:TextView=view.findViewById(R.id.placeAddress)
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view=LayoutInflater.from(parent.context).inflate(R.layout.place_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount()=placesList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val place=placesList[position]
        holder.placesName.text=place.name
        holder.placesAddress.text=place.address
    }


}
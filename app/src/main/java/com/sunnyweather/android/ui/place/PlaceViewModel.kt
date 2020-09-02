package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.Place
import retrofit2.http.Query

/**
Create by yyc
on 2020/9/2 10:12

 */
class PlaceViewModel :ViewModel(){
    private val searchLiveData=MutableLiveData<String>()

    val placeList=ArrayList<Place>()

    val placeLiveData=Transformations.switchMap(searchLiveData){query->
        Repository.searchPlaces(query)

    }
    fun searchPlaces(query: String){
        searchLiveData.value=query

    }

}
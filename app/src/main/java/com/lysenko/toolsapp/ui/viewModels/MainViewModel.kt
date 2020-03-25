package com.lysenko.myapplication.ui.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lysenko.toolsapp.remote.RetrofitFactory
import com.lysenko.toolsapp.remote.models.MachineToolApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {


    fun fetchMachineToolsList(): LiveData<List<MachineToolApi>> {

        val liveData2 =
            MutableLiveData<List<MachineToolApi>>().apply {

                RetrofitFactory().getHeroesService().getMachineTools()
                    .enqueue(object : Callback<List<MachineToolApi>> {
                        override fun onFailure(call: Call<List<MachineToolApi>>, t: Throwable) {
                            Log.e("AAAA err", t.message!!)
                        }

                        override fun onResponse(
                            call: Call<List<MachineToolApi>>,
                            response: Response<List<MachineToolApi>>
                        ) {
                            value = response.body()
                            Log.e("AAAA ok", response.body().toString())
                        }

                    })
            }
        return liveData2
    }
}
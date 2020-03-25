package com.lysenko.toolsapp.remote.services

import com.lysenko.toolsapp.remote.models.MachineToolApi
import retrofit2.Call
import retrofit2.http.GET
import io.reactivex.Observable

interface ApiService {

    @GET("./vmc_json")
    fun getMachineTools(): Call<List<MachineToolApi>>

}
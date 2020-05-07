package com.launchpad.coroutine.service

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val webservice by lazy {
  Retrofit.Builder()
    .baseUrl("https://jsonplaceholder.typicode.com/")
    .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
    .build().create(Webservice::class.java)
}
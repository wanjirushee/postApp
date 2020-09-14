package com.example.postapp.api

object ApiClient {
    var client = okHttpsClient.Builder()
        .baseUrl(baseUrl "")
        .addConverterFactory(GsonConverterFactory).create())
            .client(client)
            .build()

    fun <T>buldService(service:class:<T>):T{
        return retrofit.create(service)
    }
}
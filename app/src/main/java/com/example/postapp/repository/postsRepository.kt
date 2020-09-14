package com.example.postapp.repository

import com.example.postapp.api.ApiClient
import com.example.postapp.api.ApiInterface
import com.example.postapp.models.Post

class postsRepository {
    suspend fun getPosts():Response<List<Post>> = withContext(Dispatchers.IO){
        this:CouroutineScope

        val apiInterface = ApiClient.buildService(ApiInterface::class.java)
        val response = apiInterface.getPosts()
        return @withContext response
    }
}
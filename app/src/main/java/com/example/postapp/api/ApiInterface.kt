package com.example.postapp.api

interface ApiInterface {
    @GET (value:"posts")
    suspend fun getPosts(): Response:<List<Post>>
}
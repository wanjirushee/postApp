package com.example.postapp.models

import com.example.postapp.api.ApiClient
import com.example.postapp.api.ApiInterface

class postsRepository (){
    suspend fun getPosts():Response<List<post>> = withContext(context:Dispatchers.IO + NonCancellable){
        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val (response = apiClient.getPOsts()
        if (response.isSuccessful){
            val posts = response.body() as list<Post>
            savePOsts(posts)
        }

        return@withContext response
    }
    suspend fun savePOsts(postsList:List<post>) = withContext(Dispatchers.IO){
        this.coroutineScope
        val database = postAppDatabase.getDbInstance(postsApp.appContext)
        postsList.forEach { post =>
            database.postDAao().insertPost(post)
    }
}
}
package com.example.postapp.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.postapp.models.Post
import com.example.postapp.repository.postsRepository

class postsViewModel (val postsRepository:postsRepository): viewModel(){
        var postsLiveData = MutableLiveData<List<Post>>()

    fun getPosts(){
    viewModelScope.launch{
        this:CoroutineScope
        val response = postsRepository.getPosts()
        if (response.isSuccessful){
            postsLiveData.postValue(response.body())
        }
        else{
            postsFailedLiveData.postValue(response.errorBody()?.string())
        }
    }
    }
}
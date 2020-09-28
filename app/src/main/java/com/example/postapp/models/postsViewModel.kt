package com.example.postapp.models

import androidx.lifecycle.LiveData
import com.example.postapp.repository.postsRepository

class postsViewModel (val postsRepository: postsRepository):viewModel(){
    lateinit var  postsLiveData: LiveData<List<Post>>
    var postsFailedLiveData = MutableLiveDta<string>()

    fun getApiPosts(){
        viewModelScope.launch{ this.coroutine
            val response = postsRepository.getPosts()
            if (!response.isSuccessful){
                postsFailedLiveData.postValue(response.errorBody()?.string())
            }
        }
    }

    fun getDbPosts(){
        postsLiveData = postsRepository.getDbPosts()
    }
}


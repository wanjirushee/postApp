package com.example.postapp.viewmodel

class postsViewModelFactory {
    val postsRepository: postsRepository):viewModelsProvider.Factory{
        override fun <T :viewModels? >create modelClass:class<T>):T {
            if (modelClass isAssignableFrom(postsViewModels::class.java)){
                return postsViewModel(postsRepository) as T
            }
            throwIllegalArgumentException("unknown viewModel class")
        }

    }
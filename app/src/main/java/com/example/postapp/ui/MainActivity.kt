package com.example.postapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.postapp.R
import com.example.postapp.viewmodel.postsViewModel
import com.example.postapp.viewmodel.postsViewModelFactory

class MainActivity : AppCompatActivity() {
   lateint var postsViewModel: postsViewModel
    lateint var postViewModelFactory:postsViewModelFactory

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity.main)

        val postRepository = postRepository()
        postsViewModelFactory = postsViewModelFactory(postRepository)
        postsViewModel =
            viewModelProvider(owner:this,postsViewModelFactory).get(postsViewModel::class.Java)
         postsViewModel.getPosts()

        postsViewModel.postsLiveData.observe(owner:this,observer{postsList->
        Toast.makeText(baseContext,text:"${postsList.size}posts fetched ",Toast.LENGTH_LONG .show(){
    })
            postsViewModel.postsFailedLiveData.observe (owner:this, observe {error ->Toast.makeText
                (baseContext,error,{Toast.LENGTH_LONG).show()
            })
}

            rvData.layoutManager = LinearLayoutManager(baseContext)
            val namesAdapter = postsRecyclerViewAdapter(listOf(userId:1, id:3546753, ", "title:"course"))
            rvData.adapter = postsAdapter
    }
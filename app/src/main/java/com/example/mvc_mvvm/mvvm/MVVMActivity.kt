package com.example.mvc_mvvm.mvvm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvc_mvvm.databinding.ActivityMvvmactivityBinding
import com.example.mvc_mvvm.mvvm.adapter.User2Adapter
import com.example.mvc_mvvm.mvvm.view_model.UserViewModel

class MVVMActivity : AppCompatActivity() {
    lateinit var binding : ActivityMvvmactivityBinding
    lateinit var userViewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMvvmactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userViewModel = ViewModelProvider(this)[UserViewModel::class.java]
        binding.rcvUser.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val adapter = User2Adapter()
        binding.rcvUser.adapter = adapter

        userViewModel.list_user.observe(this, Observer { users ->
            users?.let { adapter.submitList(it) }
        })
    }
}
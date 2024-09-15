package com.example.mvc_mvvm.mvc

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvc_mvvm.R
import com.example.mvc_mvvm.mvc.adapter.UserAdapter
import com.example.mvc_mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private lateinit var userController: UserController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userController = UserController()
        val listUser = userController.getUsers()
        val userAdapter = UserAdapter(this, listUser)
        binding.rcvUser.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rcvUser.adapter = userAdapter
    }
}
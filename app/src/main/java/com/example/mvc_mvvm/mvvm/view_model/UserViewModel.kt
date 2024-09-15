package com.example.mvc_mvvm.mvvm.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvc_mvvm.model.User

class UserViewModel : ViewModel() {

    private val _users = MutableLiveData<List<User>>()
    val list_user: LiveData<List<User>> = _users

    init {
        loadUsers()
    }

    private fun loadUsers() {
        // Simulate loading users
        _users.value = listOf(
            User("John Doe 1", "john1@example.com"),
            User("Jane Doe 2", "jane2@example.com"),
            User("Jane Doe 3", "jane3@example.com"),
            User("Jane Doe 4", "jane4@example.com"),
            User("Jane Doe 5", "jane5@example.com"),
            User("Jane Doe 6", "jane6@example.com"),
            User("Jane Doe 7", "jane7@example.com"),
            User("Jane Doe 8", "jane8@example.com"),
            User("Jane Doe 9", "jane9@example.com"),
            User("Jane Doe 10", "jane10@example.com")
        )
    }
}

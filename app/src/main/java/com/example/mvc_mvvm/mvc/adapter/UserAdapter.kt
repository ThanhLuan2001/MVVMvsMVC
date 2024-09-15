package com.example.mvc_mvvm.mvc.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvc_mvvm.databinding.ItemUserBinding
import com.example.mvc_mvvm.model.User

class UserAdapter(private val context: Context, private val users: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHoler>() {

    inner class UserViewHoler(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindData(user: User){
            binding.nameTextView.text = user.name
            binding.emailTextView.text = user.email
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHoler {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemUserBinding.inflate(inflater,parent,false)
        return UserViewHoler(binding)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserViewHoler, position: Int) {
        val user = users[position]
        holder.bindData(user)
    }
}

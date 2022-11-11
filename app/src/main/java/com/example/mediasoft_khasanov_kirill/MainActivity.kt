package com.example.mediasoft_khasanov_kirill

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.mediasoft_khasanov_kirill.adapter.UserAdapter
import com.example.mediasoft_khasanov_kirill.databinding.ActivityMainBinding
import com.example.mediasoft_khasanov_kirill.model.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {

        recyclerView = binding.rvUser
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setlist(myUser())
    }

fun myUser(): ArrayList<UserModel>{
    val userlist = ArrayList<UserModel>()

    val user = UserModel("Petrov", "Vasya")
    userlist.add(user)

    val user2 = UserModel("Petrov", "Vasya")
    userlist.add(user2)

    val user3 = UserModel("Petrov", "Vasya")
    userlist.add(user3)

    val user4 = UserModel("Petrov", "Vasya")
    userlist.add(user4)

    return userlist
}

}
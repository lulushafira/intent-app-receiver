package com.example.intentapp

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        broadMessage()
    }

    private fun broadMessage(){
        val intentFilter = IntentFilter("com.example.myBroadcast")
        val objReceiver = AppReceiver()
        registerReceiver(objReceiver, intentFilter)
    }


}
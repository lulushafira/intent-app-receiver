package com.example.intentapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AppReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent) {
        val broadMessage = intent.extras?.getString("broadcast_message").toString()
        Log.d("Receiver", broadMessage)
        Toast.makeText(context, broadMessage, Toast.LENGTH_LONG).show()
    }

}
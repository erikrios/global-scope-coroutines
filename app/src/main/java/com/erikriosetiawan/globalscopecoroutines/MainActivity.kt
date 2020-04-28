package com.erikriosetiawan.globalscopecoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            Log.d(TAG, "Coroutines says hello from Thread ${Thread.currentThread().name}")
        }

        Log.d(TAG, "Hello from thread ${Thread.currentThread().name}")
    }
}

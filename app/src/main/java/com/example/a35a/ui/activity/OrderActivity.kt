package com.example.a35a.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a35a.R

class OrderActivity : AppCompatActivity() {
    override fun onPause() {
        Log.d("lifecycle","Onpause -> I am called")
        super.onPause()
    }

    override fun onResume() {
        Log.d("lifecycle","Onresume -> I am called")
        super.onResume()
    }

    override fun onStart() {
        Log.d("lifecycle","ONStart -> I am called")
        super.onStart()
    }
    override fun onDestroy() {

        Log.d("lifecycle","Ondestroy -> I am called")
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        Log.d("lifecycle","Oncreate -> I am called")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
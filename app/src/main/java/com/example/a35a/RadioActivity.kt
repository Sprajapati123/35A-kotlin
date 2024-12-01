package com.example.a35a

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {

    lateinit var mango : RadioButton
    lateinit var apple : RadioButton
    lateinit var grapes : RadioButton
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)

        mango = findViewById(R.id.radioMango)
        apple = findViewById(R.id.radioApple)
        grapes = findViewById(R.id.radioGrapes)
        image = findViewById(R.id.imageRadio)

        mango.setOnClickListener {
            image.setImageResource(R.drawable.mango)
        }

        apple.setOnClickListener {
            image.setImageResource(R.drawable.apple)
        }

        grapes.setOnClickListener {
            image.setImageResource(R.drawable.grapes)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
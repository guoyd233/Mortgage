package com.example.mortgage

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class DataActivity : AppCompatActivity() {
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView( R.layout.activity_data )

        button = findViewById<Button>( R.id.go_back )
        button.setOnClickListener { goBack() }
    }

    fun goBack( ) {
        finish()
    }
}
package com.example.mortgage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button = findViewById<Button>( R.id.modify_data )
        button.setOnClickListener { go( ) }
    }

    fun go( ) {
        var intent : Intent = Intent( this, DataActivity::class.java )
        startActivity( intent )
    }
}
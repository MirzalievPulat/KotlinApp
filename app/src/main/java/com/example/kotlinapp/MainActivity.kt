package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.openSecond)
        button.setOnClickListener(){
            openSecondPage()
        }
    }
    fun openSecondPage(){
        val intent = Intent (this, SecondActivity::class.java)
        startActivity(intent)
    }
}
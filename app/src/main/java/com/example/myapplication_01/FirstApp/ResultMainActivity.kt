package com.example.myapplication_01.FirstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication_01.R

class ResultMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_main)
        val tvResult = findViewById<TextView>(R.id.textViewResult)
        val name: String = intent.extras?.getString("extraNAme").orEmpty()
        tvResult.text = "Hola $name"
    }
}
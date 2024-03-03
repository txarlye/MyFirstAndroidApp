package com.example.myapplication_01.FirstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.myapplication_01.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnStart = findViewById<AppCompatButton>(R.id.btnClickStart)
        val etName = findViewById<AppCompatEditText>(R.id.editTextUser)


        btnStart.setOnClickListener {

            val nam = etName.text.toString()
            if (nam.isNotEmpty()) {
                Log.i("CursoAristidevs", "Button pulsado ${etName.text.toString()}")
                val intent = Intent(this, ResultMainActivity::class.java)
                intent.putExtra("extraNAme", nam)
                startActivity(intent)
            }
        }


    }
}
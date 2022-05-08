package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MoneyActivityApp : AppCompatActivity() {
    lateinit var btnCancel:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money_app)
        btnCancel=findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener {
            val intent= Intent(this,MoneyActivityApp::class.java)
            startActivity(intent)
        }
    }
}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSendMoney=findViewById(R.id.btnSendMoney)
        btnSendMoney.setOnClickListener {
            val intent= Intent(this,MoneyActivityApp::class.java)
            startActivity(intent)
        }
    }
}
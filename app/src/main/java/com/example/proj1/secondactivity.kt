package com.example.proj1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_secondactivity.*

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        var intent = intent
        val name = intent.getStringExtra("un")
        val pwd = intent.getStringExtra("un1")

        val textView2 = findViewById<TextView>(R.id.textView2)

        textView2.text = "UserName:  "+ name +" \n Password:"+ pwd
    }
}
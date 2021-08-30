package com.example.proj1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener{
   // Toast.makeText(this ,"login" , Toast.LENGTH_LONG).show()
            var myusername = username.text.toString()
            var mypassword = password.text.toString()

            if (myusername.equals("") || mypassword.equals(""))
                Toast.makeText(this,"Please enter the data",Toast.LENGTH_LONG).show()

            var status = if (username.text.toString().equals("user1")
                &&password.text.toString().equals("1234")) "Logged in successfully" else "error"

            Toast.makeText(this , status,Toast.LENGTH_LONG).show()

            //explicit intent
            var myintent = Intent(this,secondactivity::class.java)
            myintent.putExtra("un",myusername)
            myintent.putExtra("un1",mypassword)

            if (status.equals("Logged in successfully"))
                startActivity(myintent)

            register1.setOnClickListener{
                intent = Intent(this,Registeractivity::class.java)
                startActivity(intent)
            }
    }
    }
}
package com.example.proj1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_registeractivity.*

class Registeractivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var selectedRadioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeractivity)

        button.setOnClickListener {
            val username = editTextTextPersonName.text
            val pwd = editTextTextPassword.text
            val phone = editTextPhone.text
            var v1 = ""
            var v2 = ""


            if (checkBox.isChecked())
                v1 = checkBox.text.toString()

            if (checkBox2.isChecked())
                v2 = checkBox2.text.toString()


            radioGroup = findViewById(R.id.radioGroup)

            val selectedRadioButtonId: Int = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId != -1) {
                selectedRadioButton = findViewById(selectedRadioButtonId)
                val string: String = selectedRadioButton.text.toString()

                Toast.makeText(
                    this,
                    "username is  ${username} and password is  ${pwd} and phone no is ${phone} with ${v1} , ${v2} is ${string}",
                    Toast.LENGTH_LONG
                ).show()


            }
        }
    }
}
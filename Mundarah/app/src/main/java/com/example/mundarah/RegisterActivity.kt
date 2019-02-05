package com.example.mundarah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    lateinit var edittext_user : EditText
    lateinit var edittext_password : EditText
    lateinit var edittext_confirmpassword : EditText
    lateinit var button_register : Button
    lateinit var textview_login : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        edittext_user = findViewById(R.id.edittext_user) as EditText
        edittext_password =findViewById(R.id.edittext_password) as EditText
        edittext_confirmpassword =findViewById(R.id.edittext_confirmpassword) as EditText
        button_register = findViewById(R.id.button_register) as Button
        button_register.setOnClickListener()
        {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


    }
}

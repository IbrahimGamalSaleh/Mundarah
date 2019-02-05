package com.example.mundarah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var edittext_user : EditText
    lateinit var edittext_password : EditText
    lateinit var button_login :Button
    lateinit var textview_register : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edittext_user = findViewById(R.id.edittext_user) as EditText
        edittext_password =findViewById(R.id.edittext_password) as EditText
        button_login = findViewById(R.id.button_login) as Button
        textview_register = findViewById(R.id.textview_register) as TextView
               textview_register.setOnClickListener()
        {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
        button_login.setOnClickListener()
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}

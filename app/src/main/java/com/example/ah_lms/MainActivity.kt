package com.example.ah_lms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email :EditText = findViewById(R.id.emailEt)
        val password:EditText = findViewById(R.id.passwordEt)
        val login:Button = findViewById(R.id.login)


        login.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

            signUp.setOnClickListener {
                   val intent = Intent(this,sign_up::class.java)
                   startActivity(intent)
               }


        }
    }
}
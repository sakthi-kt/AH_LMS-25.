package com.example.ah_lms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*


class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val email:EditText = findViewById(R.id.emailEt)
        val passwoed:EditText = findViewById(R.id.confirmPasswordEt)
        val signup:Button = findViewById(R.id.registerBtn)

        signup.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        Toast.makeText(this,"Registered Successfully!!!",Toast.LENGTH_LONG).show()
    }
    }
}
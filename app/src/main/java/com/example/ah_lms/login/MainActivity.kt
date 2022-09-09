package com.example.ah_lms.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.ah_lms.R
import com.example.ah_lms.forget.ForgotActivity
import com.example.ah_lms.home.MainActivity2
import com.example.ah_lms.register.RegisterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email:EditText = findViewById(R.id.emailEt)
        val password:EditText = findViewById(R.id.passwordEt)
        val signin:Button = findViewById(R.id.login)
        val forgotPassword:TextView = findViewById(R.id.forgotPassword)
        val signup:TextView = findViewById(R.id.signUp)

        signup.setOnClickListener {
            val nav = Intent(this@MainActivity,RegisterActivity::class.java)
            startActivity(nav)
        }
        forgotPassword.setOnClickListener {
            val nav = Intent(this@MainActivity,ForgotActivity::class.java)
            startActivity(nav)
        }
        signin.setOnClickListener {
            val nav = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(nav)
        }
    }
}
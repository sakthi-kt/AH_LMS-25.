package com.example.ah_lms.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ah_lms.R
import com.example.ah_lms.databinding.ActivityRegisterBinding
import com.example.ah_lms.login.MainActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        login.setOnClickListener {
            val nav = Intent(this@RegisterActivity,MainActivity::class.java)
            startActivity(nav)
        }
    }
}
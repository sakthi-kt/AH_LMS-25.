package com.example.ah_lms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*


class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnsignUp.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        Toast.makeText(this,"Registered Successfully!!!",Toast.LENGTH_LONG).show()
    }
    }
}
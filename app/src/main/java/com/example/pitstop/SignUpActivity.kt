package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnsignup :Button = findViewById(R.id.button_signup)
        btnsignup.setOnClickListener(this)
    }

    override fun onClick(y: View) {
        when(y.id) {
            R.id.button_signup -> {
                val intent = Intent (this@SignUpActivity, OtpActivity1::class.java)
                startActivity(intent)
            }
        }
    }
}
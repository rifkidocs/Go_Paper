package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginAndSignupActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_and_signup)

        val btnlogin : Button = findViewById(R.id.btn_login)
        btnlogin.setOnClickListener(this)

        val btnsignup : Button = findViewById(R.id.btn_signup)
        btnsignup.setOnClickListener(this)
    }

    override fun onClick(x: View) {
        when(x.id) {
            R.id.btn_login -> {
                val intent = Intent(this@LoginAndSignupActivity, LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_signup -> {
                val intent = Intent(this@LoginAndSignupActivity, SignUpActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLoginToMain: Button = findViewById(R.id.button_login)
        btnLoginToMain.setOnClickListener(this)

        val SignUp: TextView = findViewById(R.id.tvSignUp)
        SignUp.setOnClickListener(this)

        etEmail = findViewById(R.id.et_email)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button_login -> {
                val bundle = Bundle()
                bundle.putString("email", etEmail.text.toString())

                val intent = Intent(this@LoginActivity, Homepage::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.tvSignUp -> {

                val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

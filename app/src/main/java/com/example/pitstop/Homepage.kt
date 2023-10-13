package com.example.pitstop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Homepage : AppCompatActivity() {
    private lateinit var usernameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        // Inisialisasi TextView
        usernameTextView = findViewById(R.id.Username)

        val bundle = intent.extras
        if (bundle != null) {
            // Mengambil pesan dari Bundle Intent
            val pesan = bundle.getString("email")
            // Mengatur pesan ke TextView
            usernameTextView.text = pesan
        }
    }
}

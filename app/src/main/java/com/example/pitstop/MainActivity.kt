package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnbeli : Button = findViewById(R.id.btn_beli)
        btnbeli.setOnClickListener(this)
    }

    override fun onClick(a: View) {
        when(a.id) {
            R.id.btn_beli -> {
                val intent = Intent(this@MainActivity, BeliActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
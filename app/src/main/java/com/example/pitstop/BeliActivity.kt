package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class BeliActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beli)

        val vtlihatsemua : TextView = findViewById(R.id.tv_lihatsemua)
        vtlihatsemua.setOnClickListener(this)

        val btnchat :Button = findViewById(R.id.btnchat)
        btnchat.setOnClickListener(this)

        val ivexit : ImageView = findViewById(R.id.iv_exit)
        ivexit.setOnClickListener(this)

        val btnbelisekarang : Button = findViewById(R.id.btn_belisekarang)
        btnbelisekarang.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.tv_lihatsemua -> {
                val intent = Intent(this@BeliActivity, UlasanActivity::class.java)
                startActivity(intent)
            }
            R.id.btnchat -> {
                val intent = Intent (this@BeliActivity, ChatActivity::class.java)
                startActivity(intent)
            }
            R.id.iv_exit -> {
                val intent = Intent (this@BeliActivity, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_belisekarang -> {
                val intent = Intent (this@BeliActivity, CheckoutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
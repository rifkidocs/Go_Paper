package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Kegiatan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kegiatan)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)

        val imgk1: ImageView = findViewById(R.id.imgk1)
        imgk1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> {
                finish()
            }
            R.id.imgk1 -> {
                val intent = Intent(this@Kegiatan, DetailKegiatan::class.java)
                startActivity(intent)
            }
        }
    }
}
package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ArtikelEdukasi1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artikel_edukasi1)

        val back: Button = findViewById(R.id.back)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.back -> {
              finish()
            }
        }
    }
}
package com.example.pitstop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class DetailKegiatan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kegiatan)

        val back: ImageView = findViewById(R.id.back)
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
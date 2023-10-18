package com.example.pitstop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class DetailKegiatan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kegiatan)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)

        val btnkomentar : ImageButton = findViewById(R.id.btn_komentar)
        btnkomentar.setOnClickListener {
            val bottomSheetFragment = Komentar()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }
    }

    override fun onClick(v: View) {
      when(v.id){
          R.id.back -> {
              finish()
          }
      }
    }
}
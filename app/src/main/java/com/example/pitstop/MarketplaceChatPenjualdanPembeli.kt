package com.example.pitstop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MarketplaceChatPenjualdanPembeli : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marketplace_chat_penjualdan_pembeli)

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
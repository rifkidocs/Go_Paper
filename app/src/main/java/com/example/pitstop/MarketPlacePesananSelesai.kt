package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MarketPlacePesananSelesai : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market_place_pesanan_selesai)

        val backMarketplace: ImageView = findViewById(R.id.backMarketplace)
        backMarketplace.setOnClickListener(this)

        val btnChat: Button = findViewById(R.id.btnChat)
        btnChat.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.backMarketplace -> {
              finish()
           }
           R.id.btnChat -> {
               val intent = Intent(this@MarketPlacePesananSelesai, MarketplaceChatPenjualdanPembeli::class.java)
               startActivity(intent)
           }
       }
    }
}
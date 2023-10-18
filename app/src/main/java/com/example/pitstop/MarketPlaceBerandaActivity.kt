package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MarketPlaceBerandaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market_place_beranda)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)

        val keranjang: ImageView = findViewById(R.id.keranjang)
        keranjang.setOnClickListener(this)

        val chat: ImageView = findViewById(R.id.chat)
        chat.setOnClickListener(this)

        val gundam: ImageView = findViewById(R.id.gundam)
        gundam.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> {
                finish()
            }
            R.id.keranjang -> {
                val intent = Intent(this@MarketPlaceBerandaActivity, MarketPlaceKeranjangActivity::class.java)
                startActivity(intent)
            }
            R.id.chat -> {
                val intent = Intent(this@MarketPlaceBerandaActivity, ChatActivity::class.java)
                startActivity(intent)
            }
            R.id.gundam -> {
                val intent = Intent(this@MarketPlaceBerandaActivity, BeliActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MarketplaceProfileTokoOrang : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marketplace_profile_toko_orang)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)

        val btnChat: Button = findViewById(R.id.btnChat)
        btnChat.setOnClickListener(this)

        val gundam: View = findViewById(R.id.gundam)
        gundam.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.back -> {
                finish()
            }
            R.id.btnChat -> {
                val intent = Intent(this@MarketplaceProfileTokoOrang, ChatActivity::class.java)
                startActivity(intent)
            }
            R.id.gundam -> {
                val intent = Intent(this@MarketplaceProfileTokoOrang, BeliActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
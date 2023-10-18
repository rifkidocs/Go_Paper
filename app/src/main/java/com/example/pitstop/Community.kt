package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Community : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)

        val umum: TextView = findViewById(R.id.umum)
        umum.setOnClickListener(this)

        val kegiatan: TextView = findViewById(R.id.kegiatan)
        kegiatan.setOnClickListener(this)

        val tipstrick: TextView = findViewById(R.id.tipstrick)
        tipstrick.setOnClickListener(this)

        val k1: ImageView = findViewById(R.id.k1)
        k1.setOnClickListener(this)

        val video1: ImageView = findViewById(R.id.video1)
        video1.setOnClickListener(this)

        val video2: ImageView = findViewById(R.id.video2)
        video2.setOnClickListener(this)

        val home: Button = findViewById(R.id.buttonHome)
        home.setOnClickListener(this)

        val pickup: Button = findViewById(R.id.buttonPickup)
        pickup.setOnClickListener(this)

        val news: Button = findViewById(R.id.buttonNews)
        news.setOnClickListener(this)

        val commu: Button = findViewById(R.id.buttonCommunity)
        commu.setOnClickListener(this)

        val marketplace: Button = findViewById(R.id.buttonMarketplace)
        marketplace.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> {
                finish()
            }
            R.id.umum -> {
                val intent = Intent(this@Community, Umum::class.java)
                startActivity(intent)
            }
            R.id.kegiatan -> {
                val intent = Intent(this@Community, Kegiatan::class.java)
                startActivity(intent)
            }
            R.id.tipstrick -> {
                val intent = Intent(this@Community, TipsTrick::class.java)
                startActivity(intent)
            }
            R.id.k1 -> {
                val intent = Intent(this@Community, DetailKegiatan::class.java)
                startActivity(intent)
            }
            R.id.video1 -> {
                val intent = Intent(this@Community, TipsTrick::class.java)
                startActivity(intent)
            }
            R.id.video2 -> {
                val intent = Intent(this@Community, TipsTrick::class.java)
                startActivity(intent)
            }
            R.id.buttonHome -> {
                val intent = Intent(this@Community, Homepage::class.java)
                startActivity(intent)
            }

            R.id.buttonPickup -> {
                val intent = Intent(this@Community, Pick_Up_Home::class.java)
                startActivity(intent)
            }

            R.id.buttonNews -> {
                val intent = Intent(this@Community, Edukasi::class.java)
                startActivity(intent)
            }

            R.id.buttonCommunity -> {
                val intent = Intent(this@Community, Community::class.java)
                startActivity(intent)
            }

            R.id.buttonMarketplace -> {
                val intent = Intent(this@Community, MarketPlaceBerandaActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
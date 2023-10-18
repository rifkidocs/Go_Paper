package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Edukasi : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edukasi)

        val HalamanAkun: ImageView = findViewById(R.id.HalamanAkun)
        HalamanAkun.setOnClickListener(this)

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

        val edu1: View = findViewById(R.id.viewEdu1)
        edu1.setOnClickListener(this)

        val edu2: View = findViewById(R.id.viewEdu2)
        edu2.setOnClickListener(this)

        val edu3: View = findViewById(R.id.viewEdu3)
        edu3.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonHome -> {
                val intent = Intent(this@Edukasi, Homepage::class.java)
                startActivity(intent)
            }

            R.id.buttonPickup -> {
                val intent = Intent(this@Edukasi, Pick_Up_Home::class.java)
                startActivity(intent)
            }

            R.id.buttonNews -> {
                val intent = Intent(this@Edukasi, Edukasi::class.java)
                startActivity(intent)
            }

            R.id.buttonCommunity -> {
                val intent = Intent(this@Edukasi, Community::class.java)
                startActivity(intent)
            }

            R.id.buttonMarketplace -> {
                val intent = Intent(this@Edukasi, MarketPlaceBerandaActivity::class.java)
                startActivity(intent)
            }
            R.id.viewEdu1 -> {
                val intent = Intent(this@Edukasi, ArtikelEdukasi1::class.java)
                startActivity(intent)
            }

            R.id.viewEdu2 -> {
                val intent = Intent(this@Edukasi, ArtikelEdukasi2::class.java)
                startActivity(intent)
            }

            R.id.viewEdu3 -> {
                val intent = Intent(this@Edukasi, ArtikelEdukasi3::class.java)
                startActivity(intent)
            }
            R.id.HalamanAkun -> {
                val intent = Intent(this@Edukasi, MyAccountActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
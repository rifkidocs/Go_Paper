package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Homepage : AppCompatActivity(), View.OnClickListener {
    private lateinit var usernameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

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

        val burger: ImageView = findViewById(R.id.burger)
        burger.setOnClickListener(this)

        val Notification: ImageView = findViewById(R.id.Notification)
        Notification.setOnClickListener(this)

        // Inisialisasi TextView
        usernameTextView = findViewById(R.id.Username)

        val bundle = intent.extras
        if (bundle != null) {
            // Mengambil pesan dari Bundle Intent
            val pesan = bundle.getString("email")
            // Mengatur pesan ke TextView
            usernameTextView.text = pesan
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonPickup -> {
                val intent = Intent(this@Homepage, Pick_Up_Home::class.java)
                startActivity(intent)
            }

            R.id.buttonNews -> {
                val intent = Intent(this@Homepage, Edukasi::class.java)
                startActivity(intent)
            }

            R.id.buttonCommunity -> {
                val intent = Intent(this@Homepage, Community::class.java)
                startActivity(intent)
            }

            R.id.buttonMarketplace -> {
                val intent = Intent(this@Homepage, MarketPlaceBerandaActivity::class.java)
                startActivity(intent)
            }

            R.id.viewEdu1 -> {
                val intent = Intent(this@Homepage, ArtikelEdukasi1::class.java)
                startActivity(intent)
            }

            R.id.viewEdu2 -> {
                val intent = Intent(this@Homepage, ArtikelEdukasi2::class.java)
                startActivity(intent)
            }

            R.id.viewEdu3 -> {
                val intent = Intent(this@Homepage, ArtikelEdukasi3::class.java)
                startActivity(intent)
            }
            R.id.burger -> {
                val intent = Intent(this@Homepage, MyAccountActivity::class.java)
                startActivity(intent)
            }
            R.id.Notification -> {
                val intent = Intent(this@Homepage, NotifikasiActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

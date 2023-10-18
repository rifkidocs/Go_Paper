package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class NotifikasiActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        val icon_back: ImageView = findViewById(R.id.icon_back)
        icon_back.setOnClickListener(this)

        val pandawara: ImageButton = findViewById(R.id.background1)
        pandawara.setOnClickListener(this)

        val kegiatan: ImageButton = findViewById(R.id.background2)
        kegiatan.setOnClickListener(this)

        val pesanan: ImageButton = findViewById(R.id.background3)
        pesanan.setOnClickListener(this)

        val saldo: ImageButton = findViewById(R.id.background4)
        saldo.setOnClickListener(this)

        val pickup: ImageButton = findViewById(R.id.background5)
        pickup.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.icon_back -> {
                finish()
            }

            R.id.background1 -> {
                val intent = Intent(this@NotifikasiActivity, DetailKegiatan::class.java)
                startActivity(intent)
            }

            R.id.background2 -> {
                val intent = Intent(this@NotifikasiActivity, Kegiatan::class.java)
                startActivity(intent)
            }

            R.id.background3 -> {
                val intent = Intent(this@NotifikasiActivity, MarketPlacePesananSelesai::class.java)
                startActivity(intent)
            }

            R.id.background4 -> {
                val intent = Intent(this@NotifikasiActivity, SaldoActivity::class.java)
                startActivity(intent)
            }

            R.id.background5 -> {
                val intent = Intent(this@NotifikasiActivity, PickUp3::class.java)
                startActivity(intent)
            }
        }
    }
}
package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class BeliActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beli)

        val ivexit : ImageView = findViewById(R.id.iv_exit)
        ivexit.setOnClickListener(this)

        val kunjungitoko : Button = findViewById(R.id.kunjungitoko)
        kunjungitoko.setOnClickListener(this)

        val btnchat : Button = findViewById(R.id.btnchat)
        btnchat.setOnClickListener(this)

        val btn_belisekarang : Button = findViewById(R.id.btn_belisekarang)
        btn_belisekarang.setOnClickListener(this)

        val btn_tambahtroli : Button = findViewById(R.id.btn_tambahtroli)
        btn_tambahtroli.setOnClickListener(this)

        val tv_lihatsemua : TextView = findViewById(R.id.tv_lihatsemua)
        tv_lihatsemua.setOnClickListener(this)

        val keranjang : ImageView = findViewById(R.id.keranjang)
        keranjang.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.iv_exit -> {
                finish()
            }
            R.id.kunjungitoko -> {
                val intent = Intent(this@BeliActivity, MarketplaceProfileTokoOrang::class.java)
                startActivity(intent)
            }
            R.id.btnchat -> {
                val intent = Intent(this@BeliActivity, MarketplaceChatPenjualdanPembeli::class.java)
                startActivity(intent)
            }
            R.id.btn_belisekarang -> {
                val intent = Intent(this@BeliActivity, CheckoutActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_tambahtroli -> {
                val intent = Intent(this@BeliActivity, MarketPlaceKeranjangActivity::class.java)
                startActivity(intent)
            }
            R.id.tv_lihatsemua -> {
                val intent = Intent(this@BeliActivity, UlasanActivity::class.java)
                startActivity(intent)
            }
            R.id.keranjang -> {
                val intent = Intent(this@BeliActivity, MarketPlaceKeranjangActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
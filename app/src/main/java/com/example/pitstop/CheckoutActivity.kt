package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class CheckoutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val iv_exit_checkout : ImageView = findViewById(R.id.iv_exit_checkout)
        iv_exit_checkout.setOnClickListener(this)

        val btnPesanan : Button = findViewById(R.id.btnPesanan)
        btnPesanan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.iv_exit_checkout -> {
                finish()
            }
            R.id.btnPesanan -> {
                val intent = Intent(this@CheckoutActivity, MarketPlacePesananSelesai::class.java)
                startActivity(intent)
            }
        }
    }
}
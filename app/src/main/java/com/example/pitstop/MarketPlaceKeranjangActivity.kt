package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MarketPlaceKeranjangActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market_place_keranjang)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)

        val btnCheckout: Button = findViewById(R.id.btnCheckout)
        btnCheckout.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.back -> {
               finish()
           }
           R.id.btnCheckout -> {
               val intent = Intent(this@MarketPlaceKeranjangActivity, CheckoutActivity::class.java)
               startActivity(intent)
           }
       }
    }
}
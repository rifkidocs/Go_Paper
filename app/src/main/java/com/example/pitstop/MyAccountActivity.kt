package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MyAccountActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_account)

        val iconback: ImageView = findViewById(R.id.icon_back)
        iconback.setOnClickListener(this)

        val edtprofile: Button = findViewById(R.id.edt_profile)
        edtprofile.setOnClickListener(this)

        val saldo: TextView = findViewById(R.id.saldo)
        saldo.setOnClickListener(this)

        val logout: TextView = findViewById(R.id.logout)
        logout.setOnClickListener(this)

        val tokoku: TextView = findViewById(R.id.tokoku)
        tokoku.setOnClickListener(this)

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
      when(v.id){
          R.id.icon_back -> {
              finish()
          }
          R.id.edt_profile -> {
              val intent = Intent(this@MyAccountActivity, EditProfileActivity::class.java)
              startActivity(intent)
          }
          R.id.saldo -> {
              val intent = Intent(this@MyAccountActivity, SaldoActivity::class.java)
              startActivity(intent)
          }
          R.id.tokoku -> {
              val intent = Intent(this@MyAccountActivity, TokokuActivity::class.java)
              startActivity(intent)
          }
          R.id.logout -> {
              val intent = Intent(this@MyAccountActivity, LoginActivity::class.java)
              startActivity(intent)
          }
          R.id.buttonHome -> {
              val intent = Intent(this@MyAccountActivity, Homepage::class.java)
              startActivity(intent)
          }

          R.id.buttonPickup -> {
              val intent = Intent(this@MyAccountActivity, Pick_Up_Home::class.java)
              startActivity(intent)
          }

          R.id.buttonNews -> {
              val intent = Intent(this@MyAccountActivity, Edukasi::class.java)
              startActivity(intent)
          }

          R.id.buttonCommunity -> {
              val intent = Intent(this@MyAccountActivity, Community::class.java)
              startActivity(intent)
          }

          R.id.buttonMarketplace -> {
              val intent = Intent(this@MyAccountActivity, MarketPlaceBerandaActivity::class.java)
              startActivity(intent)
          }
      }
    }
}
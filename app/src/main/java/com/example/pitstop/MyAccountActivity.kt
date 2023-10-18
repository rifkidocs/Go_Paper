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

        val tokoku: TextView = findViewById(R.id.tokoku)
        tokoku.setOnClickListener(this)
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
      }
    }
}
package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TokokuActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tokoku)

        val iconback: ImageView = findViewById(R.id.icon_back)
        iconback.setOnClickListener(this)

        val tambahbarang: Button = findViewById(R.id.tambah_barang)
        tambahbarang.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.icon_back -> {
                finish()
            }
            R.id.tambah_barang -> {
                val intent = Intent(this@TokokuActivity, TambahBarangActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
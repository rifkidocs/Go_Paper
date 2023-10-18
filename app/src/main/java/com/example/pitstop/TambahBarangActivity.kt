package com.example.pitstop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class TambahBarangActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_barang)

        val icon_back: ImageView = findViewById(R.id.icon_back)
        icon_back.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.icon_back -> {
                finish()
            }
        }
    }
}
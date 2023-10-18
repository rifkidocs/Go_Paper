package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class PickUp3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up3)

        val imgbtn_x: ImageButton = findViewById(R.id.imgbtn_x)
        imgbtn_x.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.imgbtn_x -> {
                val intent = Intent(this@PickUp3, Homepage::class.java)
                startActivity(intent)
            }
        }
    }
}
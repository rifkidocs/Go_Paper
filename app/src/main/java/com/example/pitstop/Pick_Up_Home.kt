package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class Pick_Up_Home : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up_home)

        val exit: ImageButton = findViewById(R.id.imgbtn_exit)
        exit.setOnClickListener(this)

        val pickih1: ImageButton = findViewById(R.id.pickih1)
        pickih1.setOnClickListener(this)

        val pickv: View = findViewById(R.id.pickv)
        pickv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.imgbtn_exit -> {
              finish()
           }
           R.id.pickih1 -> {
               val intent = Intent(this@Pick_Up_Home, PickUp1::class.java)
               startActivity(intent)
           }
           R.id.pickv -> {
               val intent = Intent(this@Pick_Up_Home, PickUp2::class.java)
               startActivity(intent)
           }
       }
    }
}
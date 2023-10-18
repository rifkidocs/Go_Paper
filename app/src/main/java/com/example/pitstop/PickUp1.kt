package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class PickUp1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up1)

        val pickv1: View = findViewById(R.id.pickv1)
        pickv1.setOnClickListener(this)

        val imgbtn_x: ImageButton = findViewById(R.id.imgbtn_x)
        imgbtn_x.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.pickv1 -> {
               finish()
           }
           R.id.imgbtn_x -> {
               finish()
           }
       }
    }
}
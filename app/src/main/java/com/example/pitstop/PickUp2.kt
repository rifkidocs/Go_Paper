package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PickUp2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up2)

        val pickv2: View = findViewById(R.id.pickv2)
        pickv2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.pickv2 -> {
               val intent = Intent(this@PickUp2, PickUp3::class.java)
               startActivity(intent)
           }
       }
    }
}
package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class EditProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val icon_back: ImageView = findViewById(R.id.icon_back)
        icon_back.setOnClickListener(this)

        val btn_save: Button = findViewById(R.id.btn_save)
        btn_save.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.icon_back -> {
                finish()
            }
            R.id.btn_save -> {
                finish()
            }
        }
    }
}
package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class UlasanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulasan)

        val ivexitulasan : ImageView = findViewById(R.id.iv_exitulasan)
        ivexitulasan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.iv_exitulasan -> {
                val intent = Intent(this@UlasanActivity, BeliActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
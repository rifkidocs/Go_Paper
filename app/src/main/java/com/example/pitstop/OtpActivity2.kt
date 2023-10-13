package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class OtpActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp2)
        CoroutineScope(Dispatchers.Main).launch{ delay(6000)
            val intent = Intent(this@OtpActivity2, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        val imgbtnexit2 : ImageButton = findViewById(R.id.imgbtn_exit2)
        imgbtnexit2.setOnClickListener(this)
    }

    override fun onClick(b: View) {
        when(b.id){
            R.id.imgbtn_exit2 -> {
                val intent = Intent(this@OtpActivity2, OtpActivity1::class.java)
                startActivity(intent)
            }
        }
    }
}
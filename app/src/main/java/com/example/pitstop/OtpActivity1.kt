package com.example.pitstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class OtpActivity1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp1)

        val imgbtnsms : ImageButton = findViewById(R.id.imgbtn_sms)
        imgbtnsms.setOnClickListener(this)

        val imgbtnexit : ImageButton = findViewById(R.id.imgbtn_exit)
        imgbtnexit.setOnClickListener(this)

    }

    override fun onClick(z: View) {
        when(z.id) {
            R.id.imgbtn_sms -> {
                val intent = Intent(this@OtpActivity1, OtpActivity2::class.java)
                startActivity(intent)
            }
            R.id.imgbtn_exit -> {
                val intent = Intent (this@OtpActivity1, SignUpActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
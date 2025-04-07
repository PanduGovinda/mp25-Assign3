package com.example.temperatureconverter

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val btnConvert = findViewById<Button>(R.id.btnConvert)

        // Ambil data User yang dikirim dari MainActivity
        val user = intent.getParcelableExtra<User>("user_data")

        // Tampilkan nama pengguna jika ada
        tvWelcome.text = "Selamat datang, ${user?.username ?: "Pengunjung"}!"

        btnConvert.setOnClickListener {
            val intent = Intent(this, TemperatureActivity::class.java)
            startActivity(intent)
        }
    }
}

package com.example.temperatureconverter

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert)

        val etCelcius = findViewById<EditText>(R.id.etCelcius)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val tvFahrenheit = findViewById<TextView>(R.id.tvFahrenheit)
        val tvKelvin = findViewById<TextView>(R.id.tvKelvin)
        val tvReamur = findViewById<TextView>(R.id.tvReamur)

        btnConvert.setOnClickListener {
            val celciusStr = etCelcius.text.toString()
            if (celciusStr.isEmpty()) {
                Toast.makeText(this, "Masukkan suhu terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                val c = celciusStr.toDouble()
                val fahrenheit = (c * 9/5) + 32
                val kelvin = c + 273.15
                val reamur = c * 4/5

                tvFahrenheit.text = "Fahrenheit: %.2f °F".format(fahrenheit)
                tvKelvin.text = "Kelvin: %.2f K".format(kelvin)
                tvReamur.text = "Reamur: %.2f °R".format(reamur)
            }
        }
    }
}

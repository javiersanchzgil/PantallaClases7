package com.example.pantallaclases7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMain2Binding
import com.example.pantallaclases7.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val imagenClase = intent.getIntExtra("ImagenClase", 0)
        val imagenRaza = intent.getIntExtra("ImagenRaza", 0)


        binding.fuerza2.setText((10..15).random().toString())

        binding.defensa2.setText((1..5).random().toString())


        binding.imagenClase.setImageResource(imagenClase)
        binding.imagenRaza.setImageResource(imagenRaza)









    }


}
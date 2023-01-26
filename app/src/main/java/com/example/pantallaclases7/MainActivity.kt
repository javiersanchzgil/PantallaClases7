package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var imagen=0
        binding.ladron.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenladron)
            imagen=R.drawable.imagenladron

        }
        binding.arquero.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenarquero)
            imagen=R.drawable.imagenarquero
        }

        binding.mago.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenmago)
            imagen=R.drawable.imagenmago
        }

        binding.guerrero.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenguerrero)
            imagen=R.drawable.imagenguerrero
        }


        binding.aceptar.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("ImagenClase", imagen)
            startActivity(intent)
        }










    }
}
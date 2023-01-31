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

        var imagenR=0
        var clase = ""

        binding.ladron.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenladron)
            imagenR=R.drawable.imagenladron
            clase = "imagenladron"

        }
        binding.arquero.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenarquero)
            imagenR=R.drawable.imagenarquero
            clase = "imagenarquero"
        }

        binding.mago.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenmago)
            imagenR=R.drawable.imagenmago
            clase = "imagenmago"
        }

        binding.guerrero.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenguerrero)
            imagenR=R.drawable.imagenguerrero
            clase = "imagenguerrero"
        }


        binding.aceptar.setOnClickListener(){
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("ImagenClase", imagenR)
            intent.putExtra("clase",clase)
            startActivity(intent)
        }










    }
}
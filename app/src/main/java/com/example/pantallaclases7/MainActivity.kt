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
        var clasePer = ""

        val user = intent.getSerializableExtra("personaje") as Personaje

        binding.ladron.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenladron)
            imagenR=R.drawable.imagenladron
            clase = "imagenladron"
            clasePer = "ladron"

        }
        binding.arquero.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenarquero)
            imagenR=R.drawable.imagenarquero
            clase = "imagenarquero"
            clasePer = "arquero"
        }

        binding.mago.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenmago)
            imagenR=R.drawable.imagenmago
            clase = "imagenmago"
            clasePer = "mago"
        }

        binding.guerrero.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenguerrero)
            imagenR=R.drawable.imagenguerrero
            clase = "imagenguerrero"
            clasePer = "guerrero"
        }


        binding.aceptar.setOnClickListener(){
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            user.setClase(clasePer)
            intent.putExtra("ImagenClase", imagenR)
            intent.putExtra("clase",clase)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }










    }
}
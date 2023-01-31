package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMain2Binding
import com.example.pantallaclases7.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        var clase = intent.getStringExtra("clase")
        var raza = intent.getStringExtra("raza")


        binding.fuerza2.setText((10..15).random().toString())

        binding.defensa2.setText((1..5).random().toString())


        println(clase)

        when(clase){

            "imagenguerrero"->{
                binding.imagenClase.setImageResource(R.drawable.imagenguerrero)
            }
            "imagenladron"->{
                binding.imagenClase.setImageResource(R.drawable.imagenladron)
            }
            "imagenmago"->{
                binding.imagenClase.setImageResource(R.drawable.imagenmago)
            }
            "imagenarquero"->{
                binding.imagenClase.setImageResource(R.drawable.imagenarquero)
            }
        }

        when(raza){

            "orcoimagen"->{
                binding.imagenRaza.setImageResource(R.drawable.orcoimagen)
            }
            "enanoimagen"->{
                binding.imagenRaza.setImageResource(R.drawable.enanoimagen)
            }
            "hombresimagen"->{
                binding.imagenRaza.setImageResource(R.drawable.hombresimagen)
            }

        }

        binding.botonComenzar.setOnClickListener(){
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
        }
        binding.botonVolver.setOnClickListener(){
            val intent = Intent(this@MainActivity3, MainActivity::class.java)
            startActivity(intent)
        }






    }
}
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


        binding.ladron.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenladron)

        }
        binding.elfo.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenelfo)

        }

        binding.mago.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenmago)

        }

        binding.guerrero.setOnClickListener(){
            binding.imagen.setImageResource(R.drawable.imagenguerrero)
        }

        //si pulsas el boton aceptar te manda a la segunda pantalla
        binding.aceptar.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        //si no pulsas algun boton no te deja pasar a la segunda pantalla
        binding.aceptar.setOnClickListener(){
            if(binding.ladron.isChecked || binding.elfo.isChecked || binding.mago.isChecked || binding.guerrero.isChecked){
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }



    }
}
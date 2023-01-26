package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var imagen= 0

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.orco.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.orcoimagen)
            imagen=R.drawable.orcoimagen
        }

        binding.enano.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.enanoimagen)
            imagen=R.drawable.enanoimagen
        }

        binding.hombre.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.hombresimagen)
            imagen=R.drawable.hombresimagen
        }

        binding.aceptar2.setOnClickListener(){
            intent.putExtra("ImagenRaza", imagen)
            val imagenClase = intent.getIntExtra("ImagenClase", 0)
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }


    }
}
package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var imagenC = 0
        var imagenR = 0
        var raza = ""
        var razaPer = ""
        var clase = intent.getStringExtra("clase").toString()

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje



        binding.orco.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.orcoimagen)
            imagenC=R.drawable.orcoimagen
            raza = "orcoimagen"
            razaPer = "orco"
        }

        binding.enano.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.enanoimagen)
            imagenC=R.drawable.enanoimagen
            raza = "enanoimagen"
            razaPer = "enano"
        }

        binding.hombre.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.hombresimagen)
            imagenC=R.drawable.hombresimagen
            raza = "hombresimagen"
            razaPer = "hombre"
        }

        intent.getIntExtra("ImagenRaza",imagenR)
        intent.getIntExtra("ImagenClase",imagenC)


        binding.aceptar2.setOnClickListener(){
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            user.setRaza(razaPer)
            intent.putExtra("clase",clase)
            intent.putExtra("raza",raza)
            intent.putExtra("personaje", user)
            startActivity(intent)



        }


    }
}
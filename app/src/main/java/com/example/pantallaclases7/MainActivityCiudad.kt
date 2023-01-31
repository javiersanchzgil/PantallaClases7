package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMain4Binding
import com.example.pantallaclases7.databinding.ActivityMainCiudadBinding

class MainActivityCiudad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ciudad)

        val binding = ActivityMainCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continuar.setOnClickListener(){
            val intent = Intent(this@MainActivityCiudad, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.entrarCiudad.setOnClickListener(){
            val intent = Intent(this@MainActivityCiudad, MainActivity4::class.java)
            startActivity(intent)
        }


    }
}
package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMainCiudadBinding
import com.example.pantallaclases7.databinding.ActivityMainEnemigoBinding

class MainActivityEnemigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_enemigo)

        val binding = ActivityMainEnemigoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.huir.setOnClickListener(){
            val intent = Intent(this@MainActivityEnemigo, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.luchar.setOnClickListener(){
            val intent = Intent(this@MainActivityEnemigo, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
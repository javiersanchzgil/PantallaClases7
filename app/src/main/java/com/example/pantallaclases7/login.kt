package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityLoginBinding
import com.example.pantallaclases7.databinding.ActivityMainBinding

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.botonAcceder.setOnClickListener(){
            val intent = Intent(this@login, MainActivity::class.java)
            startActivity(intent)
        }

        binding.botonRegistrarse.setOnClickListener(){
            val intent = Intent(this@login, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
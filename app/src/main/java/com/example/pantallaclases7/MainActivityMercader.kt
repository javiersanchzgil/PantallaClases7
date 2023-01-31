package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMainEnemigoBinding
import com.example.pantallaclases7.databinding.ActivityMainMercaderBinding

class MainActivityMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mercader)

        val binding = ActivityMainMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.comerciar.setOnClickListener(){
            val intent = Intent(this@MainActivityMercader, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.continuarmercader.setOnClickListener(){
            val intent = Intent(this@MainActivityMercader, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
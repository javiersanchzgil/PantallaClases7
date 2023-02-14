package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.pantallaclases7.databinding.ActivityMainEnemigoBinding
import com.example.pantallaclases7.databinding.ActivityMainMercaderBinding

class MainActivityMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mercader)

        val binding = ActivityMainMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView4.setImageResource(R.drawable.mercader)

        binding.comprar.isVisible = false
        binding.vender.isVisible = false
        binding.cancelar.isVisible = false
        binding.textoMicro.isVisible = false
        binding.editTextNumber.isVisible = false

        binding.comerciar.setOnClickListener(){
            binding.comprar.isVisible = true
            binding.vender.isVisible = true
            binding.cancelar.isVisible = true
            binding.comerciar.isVisible = false
            binding.continuarmercader.isVisible = false
        }

        binding.comprar.setOnClickListener(){
            binding.imageView4.setImageResource(R.drawable.microfono)
            binding.textoMicro.isVisible = false
            binding.editTextNumber.isVisible = false
            binding.comprar.isVisible = true
            binding.vender.isVisible = false
            binding.cancelar.isVisible = false
            binding.comerciar.isVisible = false
            binding.continuarmercader.isVisible = false
        }

        binding.continuarmercader.setOnClickListener(){
            val intent = Intent(this@MainActivityMercader, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
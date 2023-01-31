package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMainMercaderBinding
import com.example.pantallaclases7.databinding.ActivityMainObjetoBinding

class MainActivityObjeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_objeto)

        val binding = ActivityMainObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recoger.setOnClickListener(){
            val intent = Intent(this@MainActivityObjeto, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.continuarObjeto.setOnClickListener(){
            val intent = Intent(this@MainActivityObjeto, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
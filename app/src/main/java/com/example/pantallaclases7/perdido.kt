package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityPeleaEnemigoBinding
import com.example.pantallaclases7.databinding.ActivityPerdidoBinding

class perdido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perdido)

        val binding = ActivityPerdidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje

        binding.botonPerdido.setOnClickListener(){
            val intent = Intent(this@perdido, MainActivityEnemigo::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }
    }
}
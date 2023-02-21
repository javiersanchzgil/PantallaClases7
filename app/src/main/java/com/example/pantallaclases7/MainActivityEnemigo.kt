package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.pantallaclases7.databinding.ActivityMainCiudadBinding
import com.example.pantallaclases7.databinding.ActivityMainEnemigoBinding

class MainActivityEnemigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_enemigo)

        val binding = ActivityMainEnemigoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje
       // val textView = findViewById<TextView>(R.id.mochilaObjeto)

        binding.huir.setOnClickListener(){
            val intent = Intent(this@MainActivityEnemigo, MainActivity4::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }

        binding.luchar.setOnClickListener(){
            val intent = Intent(this@MainActivityEnemigo, PeleaEnemigo::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }
    }
}
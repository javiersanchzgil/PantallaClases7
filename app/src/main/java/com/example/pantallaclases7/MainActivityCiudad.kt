package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.pantallaclases7.databinding.ActivityMain4Binding
import com.example.pantallaclases7.databinding.ActivityMainCiudadBinding

class MainActivityCiudad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ciudad)

        val binding = ActivityMainCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje
        //val textView = findViewById<TextView>(R.id.mochilaObjeto)

        binding.continuar.setOnClickListener(){
            val intent = Intent(this@MainActivityCiudad, MainActivity4::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }

        binding.entrarCiudad.setOnClickListener(){
            val intent = Intent(this@MainActivityCiudad, MainActivity4::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }


    }
}
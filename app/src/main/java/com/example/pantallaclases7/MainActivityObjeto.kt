package com.example.pantallaclases7

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.pantallaclases7.databinding.ActivityMainMercaderBinding
import com.example.pantallaclases7.databinding.ActivityMainObjetoBinding

class MainActivityObjeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_objeto)

        val binding = ActivityMainObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val user = intent.getSerializableExtra("personaje") as Personaje
        val textView = findViewById<TextView>(R.id.mochilaObjeto)

        textView.text = "Espacio mochila : ${user.getPesoMochila()}/100"


        binding.recoger.setOnClickListener(){
            //restar peso mochila
            user.setPesoMochila(user.getPesoMochila() - 5)
            user.setObjetos(user.getObjetos() + 1)
            val intent = Intent(this@MainActivityObjeto, MainActivity4::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }

        binding.continuarObjeto.setOnClickListener(){
            val intent = Intent(this@MainActivityObjeto, MainActivity4::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }
    }

}
package com.example.pantallaclases7

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pantallaclases7.databinding.ActivityMain4Binding



class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje
        val textView = findViewById<TextView>(R.id.textoMochila)


        textView.text = "Espacio mochila : ${user.getPesoMochila()}/100, Numero de objetos: ${user.getObjetos()}"



        binding.dado.setOnClickListener(){
           //var num = (1..4).random()
            var num = 4
            when(num){

                1 -> {
                    val intent = Intent(this@MainActivity4, MainActivityObjeto::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }

                2 -> {
                    val intent = Intent(this@MainActivity4, MainActivityCiudad::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
                3 -> {
                    val intent = Intent(this@MainActivity4, MainActivityMercader::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
                4 -> {
                    val intent = Intent(this@MainActivity4, MainActivityEnemigo::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
            }
        }
    }

}


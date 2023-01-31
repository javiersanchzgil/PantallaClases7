package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityMain3Binding
import com.example.pantallaclases7.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.dado.setOnClickListener(){
            var num = ((1..4).random())

            when(num){

                1 -> {
                    val intent = Intent(this@MainActivity4, MainActivityObjeto::class.java)
                    startActivity(intent)
                }

                2 -> {
                    val intent = Intent(this@MainActivity4, MainActivityCiudad::class.java)
                    startActivity(intent)
                }
                3 -> {
                    val intent = Intent(this@MainActivity4, MainActivityMercader::class.java)
                    startActivity(intent)
                }
                4 -> {
                    val intent = Intent(this@MainActivity4, MainActivityEnemigo::class.java)
                    startActivity(intent)
                }


            }

        }










    }
}
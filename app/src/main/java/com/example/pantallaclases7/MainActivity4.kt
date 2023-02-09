package com.example.pantallaclases7

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pantallaclases7.databinding.ActivityMain4Binding



class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var vmochila : Int = 100
        var mPrefs = getSharedPreferences("Objetos_mochila",Context.MODE_PRIVATE)
        var mochila = mPrefs.getInt("mochila",vmochila)

        guardar(mochila)



        binding.textoMochila.text = "Espacio mochila : ${mochila}/100"


        binding.dado.setOnClickListener(){
            var num = (1..4).random()

            when(num){

                1 -> {
                    val intent = Intent(this@MainActivity4, MainActivityObjeto::class.java)
                    intent.putExtra("mochila",mochila)
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
    fun guardar (Int:Int){
        var mochila:Int = intent.getIntExtra("mochila",100)
        var mPrefs = getSharedPreferences("Objetos_mochila",Context.MODE_PRIVATE)
        var editor = mPrefs.edit()
        editor.putInt("mochila", mochila)
        editor.commit()
        Toast.makeText(this,"Se ha guardado",Toast.LENGTH_LONG).show()

    }
}


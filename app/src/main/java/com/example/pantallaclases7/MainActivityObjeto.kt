package com.example.pantallaclases7

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pantallaclases7.databinding.ActivityMainMercaderBinding
import com.example.pantallaclases7.databinding.ActivityMainObjetoBinding

class MainActivityObjeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_objeto)

        val binding = ActivityMainObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var vmochila = 100
        var mPrefs = getSharedPreferences("Objetos_mochila",Context.MODE_PRIVATE)
        var mochila = mPrefs.getInt("mochila",vmochila)

        guardar(mochila)



        binding.mochilaObjeto.text = "Espacio mochila : ${mochila}/100"


        binding.recoger.setOnClickListener(){
            mochila -= 5
            val intent = Intent(this@MainActivityObjeto, MainActivity4::class.java)
            intent.putExtra("mochila",mochila)
            startActivity(intent)
        }

        binding.continuarObjeto.setOnClickListener(){
            val intent = Intent(this@MainActivityObjeto, MainActivity4::class.java)
            startActivity(intent)
        }
    }

    fun guardar (Int:Int){
        var mochila:Int = intent.getIntExtra("mochila",100)
        var mPrefs = getSharedPreferences("Objetos_mochila", Context.MODE_PRIVATE)
        var editor = mPrefs.edit()
        editor.putInt("mochila", mochila)
        editor.commit()
        Toast.makeText(this,"Se ha guardado", Toast.LENGTH_LONG).show()

    }
}
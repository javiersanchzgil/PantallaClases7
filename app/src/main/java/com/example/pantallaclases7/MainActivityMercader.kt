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

        var mochila = 0
        var vender = 0


        binding.imageView4.setImageResource(R.drawable.mercader)

        binding.comprar.isVisible = false
        binding.vender.isVisible = false
        binding.cancelar.isVisible = false
        binding.textoMicro.isVisible = false
        binding.editTextNumber.isVisible = false
        binding.comprobar.isVisible = false


        binding.comerciar.setOnClickListener(){
            binding.comprar.isVisible = true
            binding.vender.isVisible = true
            binding.cancelar.isVisible = true
            binding.comerciar.isVisible = false
            binding.continuarmercader.isVisible = false
            binding.comprobar.isVisible = false

        }

        binding.comprar.setOnClickListener(){
            binding.imageView4.setImageResource(R.drawable.microfono)
            binding.textoMicro.isVisible = true
            binding.editTextNumber.isVisible = true
            binding.comprar.isVisible = true
            binding.vender.isVisible = false
            binding.cancelar.isVisible = false
            binding.comerciar.isVisible = false
            binding.continuarmercader.isVisible = false
            binding.comprobar.isVisible = false

            binding.comprar.setOnClickListener(){
                mochila += binding.editTextNumber.text.toString().toInt()
                binding.imageView4.setImageResource(R.drawable.mercader)
                binding.comprar.isVisible = false
                binding.vender.isVisible = true
                binding.cancelar.isVisible = true
                binding.comerciar.isVisible = false
                binding.continuarmercader.isVisible = false
                binding.textoMicro.isVisible = false
                binding.editTextNumber.isVisible = false
                binding.comprobar.isVisible = false

            }
        }

        binding.continuarmercader.setOnClickListener(){
            val intent = Intent(this@MainActivityMercader, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.cancelar.setOnClickListener(){
            binding.imageView4.setImageResource(R.drawable.mercader)
            binding.comprar.isVisible = false
            binding.vender.isVisible = false
            binding.cancelar.isVisible = false
            binding.comerciar.isVisible = true
            binding.continuarmercader.isVisible = true
        }

        binding.vender.setOnClickListener(){
            binding.imageView4.setImageResource(R.drawable.mochila)
            binding.textoMicro.isVisible = true
            binding.editTextNumber.isVisible = true
            binding.comprar.isVisible = false
            binding.vender.isVisible = true
            binding.cancelar.isVisible = true
            binding.comerciar.isVisible = false
            binding.continuarmercader.isVisible = false
            binding.comprobar.isVisible = true
            binding.vender.isEnabled = false
            binding.comprobar.setOnClickListener(){
                vender = binding.editTextNumber.text.toString().toInt()
                if (mochila == 0){
                    binding.textoMicro.setText("No tienes nada que vender")
                }
                else
                    if (vender > mochila){
                        binding.textoMicro.setText("No tienes tantos objetos")
                    }
                    else{
                        binding.textoMicro.setText("Has vendido $vender objetos")
                        mochila = mochila - vender
                        binding.vender.isEnabled = true
                        binding.vender.setOnClickListener(){
                            binding.imageView4.setImageResource(R.drawable.mercader)
                            binding.comprar.isVisible = false
                            binding.vender.isVisible = false
                            binding.cancelar.isVisible = false
                            binding.comerciar.isVisible = true
                            binding.continuarmercader.isVisible = true

                        }
                    }
            }
            binding.cancelar.setOnClickListener(){
                binding.imageView4.setImageResource(R.drawable.mercader)
                binding.comprar.isVisible = false
                binding.vender.isVisible = false
                binding.cancelar.isVisible = false
                binding.comerciar.isVisible = true
                binding.continuarmercader.isVisible = true
            }

        }
    }
}
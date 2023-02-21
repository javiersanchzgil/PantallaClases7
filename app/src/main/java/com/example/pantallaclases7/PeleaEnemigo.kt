package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityPeleaEnemigoBinding

class PeleaEnemigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelea_enemigo)

        val binding = ActivityPeleaEnemigoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje
        var vidaEnemigo = 0
        var ataqueEnemigo = 0

        val elegirEnemigo = (1..2).random()
        if (elegirEnemigo == 1) {
            vidaEnemigo = 100
            ataqueEnemigo = 20/user.getDefensa()
            binding.vidaEnemigo.text = "Enemigo normal: $vidaEnemigo vida"

        } else {
            vidaEnemigo = 200
            ataqueEnemigo = 30/user.getDefensa()
            binding.vidaEnemigo.text = "Enemigo jefe: $vidaEnemigo vida"
        }

        binding.vidaPersonaje.text = "Personaje: ${user.getVida()} vida"


        binding.botonatacar.setOnClickListener() {
            val dadoataque = (1..6).random()
            if (dadoataque == 1 || dadoataque == 2 || dadoataque == 3) {
                binding.textoInfo.text = "Has fallado el ataque"
                user.setVida(user.getVida() - ataqueEnemigo)
                binding.vidaPersonaje.text = "Personaje: ${user.getVida()} vida"
                if (user.getVida() <= 0) {
                    binding.textoInfo.text = "Has muerto"
                    val intent = Intent(this@PeleaEnemigo, perdido::class.java)
                    user.setVida(100)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
                if (vidaEnemigo <= 0) {
                    user.setObjetos(user.getObjetos() + 3)
                    binding.textoInfo.text = "Has ganado la pelea"
                    val intent = Intent(this@PeleaEnemigo, MainActivityEnemigo::class.java)
                    user.setVida(100)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }

            } else {
                binding.textoInfo.text = "Has acertado el ataque y has hecho ${user.getFuerza()} de daño"
                vidaEnemigo = vidaEnemigo - user.getFuerza()
                binding.vidaEnemigo.text = "Enemigo: $vidaEnemigo vida"
                user.setVida(user.getVida() - ataqueEnemigo)
                binding.vidaPersonaje.text = "Personaje: ${user.getVida()} vida"
                if (user.getVida() <= 0) {
                    binding.textoInfo.text = "Has muerto"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, perdido::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
                if (vidaEnemigo <= 0) {
                    user.setObjetos(user.getObjetos() + 3)
                    binding.textoInfo.text = "Has ganado la pelea"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, MainActivityEnemigo::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
            }
        }

        binding.botonHuir.setOnClickListener() {
            val dadoHuir = (1..6).random()
            if (dadoHuir == 1 || dadoHuir == 2 || dadoHuir == 3) {
                binding.textoInfo.text = "Has fallado la huida"
                user.setVida(user.getVida() - ataqueEnemigo)
                binding.vidaPersonaje.text = "Personaje: ${user.getVida()} vida"
                if (user.getVida() <= 0) {
                    binding.textoInfo.text = "Has muerto"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, perdido::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
                if (vidaEnemigo <= 0) {
                    user.setObjetos(user.getObjetos() + 3)
                    binding.textoInfo.text = "Has ganado la pelea"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, MainActivityEnemigo::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
            } else {
                binding.textoInfo.text = "Has huido"
                user.setVida(100)
                val intent = Intent(this@PeleaEnemigo, MainActivityEnemigo::class.java)
                intent.putExtra("personaje", user)
                startActivity(intent)
            }
        }

        binding.botonObjeto.setOnClickListener(){
            if (user.getObjetos() >= 1) {
                user.setObjetos(user.getObjetos() - 1)
                user.setPesoMochila(user.getPesoMochila() + 5)
                user.setVida(user.getVida() + 20)
                binding.vidaPersonaje.text = "Personaje: ${user.getVida()} vida"
                binding.textoInfo.text = "Has usado un objeto y te has curado 20 de vida"
                user.setVida(user.getVida() - ataqueEnemigo)
                binding.vidaPersonaje.text = "Personaje: ${user.getVida()} vida"
                if (user.getVida() <= 0) {
                    binding.textoInfo.text = "Has muerto"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, perdido::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
                if (vidaEnemigo <= 0) {
                    user.setObjetos(user.getObjetos() + 3)
                    binding.textoInfo.text = "Has ganado la pelea"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, MainActivityEnemigo::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
            }
            else{
                binding.textoInfo.text = "No tienes objetos"
                user.setVida(user.getVida() - ataqueEnemigo)
                binding.vidaPersonaje.text = "Personaje: ${user.getVida()} vida"
                if (user.getVida() <= 0) {
                    binding.textoInfo.text = "Has muerto"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, perdido::class.java)
                    user.setVida(100)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
                if (vidaEnemigo <= 0) {
                    user.setObjetos(user.getObjetos() + 3)
                    binding.textoInfo.text = "Has ganado la pelea"
                    user.setVida(100)
                    val intent = Intent(this@PeleaEnemigo, MainActivityEnemigo::class.java)
                    intent.putExtra("personaje", user)
                    startActivity(intent)
                }
            }
        }





    }
}
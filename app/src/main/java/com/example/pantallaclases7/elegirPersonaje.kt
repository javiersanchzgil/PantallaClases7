package com.example.pantallaclases7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pantallaclases7.databinding.ActivityElegirPersonajeBinding
import com.google.firebase.firestore.FirebaseFirestore

class elegirPersonaje : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elegir_personaje)

        val binding = ActivityElegirPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje


        setup()


    }

    private fun setup() {

        val binding = ActivityElegirPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("personaje") as Personaje

        binding.textoNom.text = "Nombre: ${user.getNombre()}"
        binding.textoPesoMochila.text = "Peso de la mochila: ${user.getPesoMochila()}"
        binding.textoEstadoVital.text = "Estado vital: ${user.getEstadoVital()}"
        binding.textoRaza.text = "Raza: ${user.getRaza()}"
        binding.textoClase.text = "Clase: ${user.getClase()}"
        binding.textoClase.text = "Clase: ${user.getClase()}"
        binding.textoObjetos.text = "Objetos: ${user.getObjetos()}"
        binding.textoVida.text = "Vida: ${user.getVida()}"
        binding.textoFuerza.text = "Fuerza: ${user.getFuerza()}"
        binding.textoDefensa.text = "Defensa: ${user.getDefensa()}"


        binding.continuarConPer.setOnClickListener() {
            db.collection("personajes").document(user.getCorreo()).set(
                hashMapOf(
                    "nombre" to user.getNombre(),
                    "pesoMochila" to user.getPesoMochila(),
                    "estadoVital" to user.getEstadoVital(),
                    "raza" to user.getRaza(),
                    "clase" to user.getClase(),
                    "objetos" to user.getObjetos(),
                    "vida" to user.getVida(),
                    "fuerza" to user.getFuerza(),
                    "defensa" to user.getDefensa()
                )
            )
            val intent = Intent(this@elegirPersonaje, MainActivity4::class.java)
            intent.putExtra("personaje", user)
            startActivity(intent)
        }




        binding.cargarPersonaje.setOnClickListener() {
            db.collection("personajes").document(user.getCorreo()).get().addOnSuccessListener {
                val nombre = it.get("nombre").toString()
                val pesoMochila = it.get("pesoMochila").toString().toInt()
                val estadoVital = it.get("estadoVital").toString()
                val raza = it.get("raza").toString()
                val clase = it.get("clase").toString()
                val objetos = it.get("objetos").toString().toInt()
                val vida = it.get("vida").toString().toInt()
                val fuerza = it.get("fuerza").toString().toInt()
                val defensa = it.get("defensa").toString().toInt()

                user.setNombre(nombre)
                user.setPesoMochila(pesoMochila)
                user.setEstadoVital(estadoVital)
                user.setRaza(raza)
                user.setClase(clase)
                user.setObjetos(objetos)
                user.setVida(vida)
                user.setFuerza(fuerza)
                user.setDefensa(defensa)

                binding.cargarPersonaje.isEnabled = false

                binding.textoNom.text = "Nombre: ${user.getNombre()}"
                binding.textoPesoMochila.text = "Peso de la mochila: ${user.getPesoMochila()}"
                binding.textoEstadoVital.text = "Estado vital: ${user.getEstadoVital()}"
                binding.textoRaza.text = "Raza: ${user.getRaza()}"
                binding.textoClase.text = "Clase: ${user.getClase()}"
                binding.textoClase.text = "Clase: ${user.getClase()}"
                binding.textoObjetos.text = "Objetos: ${user.getObjetos()}"
                binding.textoVida.text = "Vida: ${user.getVida()}"
                binding.textoFuerza.text = "Fuerza: ${user.getFuerza()}"
                binding.textoDefensa.text = "Defensa: ${user.getDefensa()}"

            }
        }
    }
}
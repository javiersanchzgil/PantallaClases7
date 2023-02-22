package com.example.pantallaclases7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.pantallaclases7.databinding.ActivityLoginBinding
import com.example.pantallaclases7.databinding.ActivityUsersesionBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

enum class ProviderType {
    BASIC
}

class usersesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usersesion)

        val binding = ActivityUsersesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Setup
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")
        setup(email ?: "", provider ?: "")


    }

    private fun setup (email: String,provider: String) {

        val binding = ActivityUsersesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Inicio"

        binding.emailUsuario.text = email
        binding.tipoUsuario.text = provider

        binding.botonCerrarSesion.setOnClickListener() {
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }


    }
}
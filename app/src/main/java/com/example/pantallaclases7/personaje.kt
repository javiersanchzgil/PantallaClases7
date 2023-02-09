package com.example.pantallaclases7

    data class personaje(
        private var nombre: String,
        private var pesoMochila: Int,
        private var estadoVital: String,
        private var raza: String,
        private var clase: String,

        ) {
        var monedero = HashMap<Int, Int>()

        init {
            monedero.put(1, 0)
            monedero.put(5, 0)
            monedero.put(10, 0)
            monedero.put(25, 0)
            monedero.put(100, 0)
        }

        fun getNombre(): String {
            return nombre
        }

        fun setNombre(nombre: String) {
            this.nombre = nombre
        }

        fun getEstadoVital(): String {
            return estadoVital
        }

        fun setEstadoVital(estadoVital: String) {
            this.estadoVital = estadoVital
        }

        fun getRaza(): String {
            return raza
        }

        fun setRaza(raza: String) {
            this.raza = raza
        }

        fun getClase(): String {
            return clase
        }

        fun setClase(clase: String) {
            this.clase = clase
        }
    }


package com.example.pantallaclases7


    data class Personaje(
        private var nombre: String,
        private var pesoMochila: Int,
        private var estadoVital: String,
        private var raza: String,
        private var clase: String,
        private var objetos: Int,
        private var vida: Int,
        private var fuerza: Int,
        private var defensa: Int,

        ) : java.io.Serializable {
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

        fun getPesoMochila(): Int {
            return pesoMochila
        }

        fun setPesoMochila(pesoMochila: Int) {
            this.pesoMochila = pesoMochila
        }

        fun getObjetos(): Int {
            return objetos
        }

        fun setObjetos(objetos: Int) {
            this.objetos = objetos
        }

        fun getVida(): Int {
            return vida
        }

        fun setVida(vida: Int) {
            this.vida = vida
        }

        fun getFuerza(): Int {
            return fuerza
        }

        fun setFuerza(fuerza: Int) {
            this.fuerza = fuerza
        }

        fun getDefensa(): Int {
            return defensa
        }

        fun setDefensa(defensa: Int) {
            this.defensa = defensa
        }


       //crear el constructor de la clase personaje vacio
        constructor() : this("", 0, "", "", "", 0, 0, 0, 0) {
            this.monedero = monedero
        }


        }




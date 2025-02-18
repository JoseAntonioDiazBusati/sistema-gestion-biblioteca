package org.example

sealed class Usuario {

    data class Estudiante(val id: String, val nombre: String, val carrera: String)
    data class Profesor(val id: String, val nombre: String, val departamento: String)
    data class Visitante(val id: String, val nombre: String)

}
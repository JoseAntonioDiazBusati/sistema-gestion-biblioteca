package org.example

import org.example.DatosBiblioteca.Libro

sealed class Usuario {

    data class Estudiante(val id: String, val nombre: String, val carrera: String): Usuario()
    data class Profesor(val id: String, val nombre: String, val departamento: String): Usuario()
    data class Visitante(val id: String, val nombre: String): Usuario()

    fun tomarPrestado(usuario: Usuario, libro: Libro): String {
        return when (usuario) {
            is Estudiante -> "${usuario.nombre} puede tomar prestado '${libro.titulo}' por 10 días."
            is Profesor -> "${usuario.nombre} puede tomar prestado '${libro.titulo}' por 20."
            is Visitante -> "${usuario.nombre} no puede tomar prestado '${libro.titulo}'."
        }
    }

}
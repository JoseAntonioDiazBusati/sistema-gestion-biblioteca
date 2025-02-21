package org.example

import org.example.DatosBiblioteca.DVD
import org.example.DatosBiblioteca.Libro
import org.example.DatosBiblioteca.Revista

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val libro = Libro("El señor de los anillos: El retorno del Rey", "Yo",2025)
    val libro1 = Libro("El padrino", "No es anonimo",1920)
    val libro2 = Libro("Harry Potta 3", "Yo",2025)

    val profesor = Usuario.Profesor("0007", "Diegoool", "Programacion")
    println(profesor.tomarPrestado(profesor,libro))
}
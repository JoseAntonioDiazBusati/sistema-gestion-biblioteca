## Sistema de Biblioteca

### Parte 1: Definir Data Class

Para representar los distintos tipos de ítems en la biblioteca, se usarán `data class` para almacenar la información básica de cada uno:

- **Libro**: `Título` (String), `Autor` (String) y `Año de Publicación` (Int)
- **Revista**: `Título` (String), `Issue` (Int), `Año` (Int)
- **DVD**: `Título` (String), `Director` (String), `Año` (Int)

Las `data class` son ideales para almacenar datos sin necesidad de lógica adicional.

### Parte 2: Definir Sealed Class

Para gestionar los distintos tipos de usuarios de la biblioteca, se usará una `sealed class`. Esto permite definir una jerarquía cerrada de clases, garantizando que todos los subtipos de `Usuario` están definidos en el mismo archivo.

- **Usuario** (clase sellada)
    - **Estudiante**: `id` (String), `nombre` (String), `carrera` (String)
    - **Profesor**: `id` (String), `nombre` (String), `departamento` (String)
    - **Visitante**: `id` (String), `nombre` (String)

Esto permitirá manejar operaciones específicas para cada tipo de usuario, como préstamos de libros o acceso a áreas restringidas de la biblioteca.

### Ejercicio Propuesto

1. **Definir las `data class`** para `Libro`, `Revista` y `DVD`.
2. **Crear la `sealed class Usuario`** con las subclases `Estudiante`, `Profesor` y `Visitante`, cada una con sus respectivas propiedades.
3. **Implementar una función** que acepte un `Usuario` y un `Libro`, y devuelva un mensaje indicando si el usuario puede o no tomar prestado el libro. Se pueden aplicar reglas como:
   - Los `Visitantes` no pueden tomar prestados libros.
   - Los `Profesores` pueden tener préstamos por más tiempo.

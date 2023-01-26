fun main(args: Array<String>) {
    val libro1 = Libro("Bruno Puelles","La Ciudad de los Mil Ojos",448,9)

    val Biblioteca = ConjuntosLibros(1,libro1)

    println("Introduce el máximo de libros que tendrá la biblioteca")
    Biblioteca.maxLibros = readln().toInt()

    val libro2 = Libro("J.R.R. Tolkien","El Señor de los Anillos",566,8)
    Biblioteca.añadir(libro2)
    val libro3 = Libro("J.R.R. Tolkien","Las Torres",566,8)
    Biblioteca.añadir(libro3)

    println(Biblioteca.toString())

    println()
    println("Borrar El Señor de los Anillos")
    Biblioteca.borrarLibroTitulo("El Señor de los Anillos")
    println(Biblioteca.toString())

    println("Cambiar tamaño a 1")
    Biblioteca.maxLibros = 1
    println(Biblioteca.toString())
}

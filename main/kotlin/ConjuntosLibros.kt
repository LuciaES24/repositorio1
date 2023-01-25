class ConjuntosLibros {
    var libros = mutableListOf<Libro>()
    fun imprimirLibreria(){
        println(libros)
    }
    fun menuLibro(){
        println("1) Mostrar un libro por su título")
        println("2) Mostrar un libro por su autor")
        println("3) Modificar calificación de un libro")
        var opcion = readln().toInt()
        when(opcion){
            1-> {
                println("Escriba el título del libro")
                var opcionTitulo = readln().toString()
                println(Libro(nuevoTitulo = opcionTitulo, nuevoAutor = "", numeroPaginas = 0, nuevaCalif = 0))
            }
            2 -> {
                println("Escriba el autor del libro")
                var opcionAutor = readln().toString()
                println(Libro(nuevoTitulo = "", nuevoAutor = opcionAutor, numeroPaginas = 0, nuevaCalif = 0))
            }
        }
    }
}
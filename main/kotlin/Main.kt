fun main(args: Array<String>) {
    val libro1 = Libro("Bruno Puelles","La Ciudad de los Mil Ojos",448,9)
    val libro2 = Libro("J.R.R. Tolkien","El Señor de los Anillos",566,8)
    val libro3 = Libro("J.K. Rowling","Harry Potter",254,6)
    libro1.imprimirLibro()
    libro2.imprimirLibro()
    libro3.imprimirLibro()
    ConjuntosLibros().imprimir()
}

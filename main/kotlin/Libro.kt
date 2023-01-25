class Libro (nuevoAutor : String, nuevoTitulo : String, numeroPaginas : Int, nuevaCalif : Int){
    var autor = nuevoAutor
    var titulo = nuevoTitulo
    var paginas = numeroPaginas
    var calificacion = nuevaCalif
        set(valor){
            if (valor>=0 && valor<=10){
                field = valor
            }else{
                println("Calificación errónea")
            }
        }
        get():Int{
            return field
        }
    fun imprimirLibro(){
        println("El libro $titulo fue escrito por $autor. Tiene $paginas páginas y la calificación que le has dado es un $calificacion")
    }
}


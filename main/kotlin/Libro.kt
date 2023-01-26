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

    constructor(otroLibro:Libro):this(otroLibro.titulo,otroLibro.autor,otroLibro.paginas,otroLibro.calificacion){

    }

    override fun toString(): String {
        return "Libro(titulo=$titulo, autor=$autor, paginas=$paginas,nota=$calificacion)"
    }

}


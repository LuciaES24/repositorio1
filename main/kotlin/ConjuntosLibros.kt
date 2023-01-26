class ConjuntosLibros (numMaxLibros: Int){
    var libros = mutableListOf<Libro>()
    var maxLibros = 3
        get(){
            return field
        }
        set(value){
            if (value<1 || value<libros.size){
                println("Error, no puede haber menos de 1 libro")
            }else{
                if (value<libros.size){
                    while(value<libros.size){
                        libros.removeAt(value)
                    }
                }
                field = value
            }
        }
    init {
        maxLibros = numMaxLibros
    }
    constructor(numMaxLibros: Int,libroInicial: Libro):this(numMaxLibros){
        libros.add(libroInicial)
    }

    constructor(numMaxLibros: Int,listaInicial: kotlin.collections.MutableList<Libro>):this(numMaxLibros){
        //libros = listaInicial  reasigna la lista
        for (libroActual in listaInicial){
            val nuevoLibro = Libro(libroActual)//Crea la copia en el constructos de copias de la clase libro
            libros.add(nuevoLibro)
        }

    }
    fun añadir(libroInicial: Libro){
        if (libros.size<maxLibros) {
            libros.add(libroInicial)
        }else{
            println("Demasiados libros")
        }
    }

    override fun toString(): String {
        var cadenaLibros = "\n"
        for (libroActual in libros){
            cadenaLibros += libroActual.toString()+"\n"
        }
        return "ConjuntosLibros(libros=$cadenaLibros, maxLibros= $maxLibros)"
    }

    fun borrarLibroTitulo(tituloaBorrar:String){
        for (libroActual in libros){
            if (libroActual.titulo.equals(tituloaBorrar)){
                libros.remove(libroActual)
                break
            }
        }
    }

    fun borrarLibroAutor(){

    }
}
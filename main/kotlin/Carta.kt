class Carta(numero: Int, palo:String) {
    var numero = numero
        set(valor){
            if (valor>0 && valor<=13){
                field = valor
            }else{
                println("Número erróneo")
            }
        }
        get():Int{
            return field
        }
    var palo = palo
        set(valor){
            if (valor=="c" || valor == "p" || valor == "r" || valor == "t"){
                field = valor
            }else{
                println("Palo erróneo")
            }
        }
        get():String{
            when(field){
                "c" -> field = "Corazones"
                "r" -> field = "Rombos"
                "t" -> field = "Tréboles"
                "p" -> field = "Picas"
            }
            return field
        }
    fun mostrar_carta(){
        when(numero){
            in 2..10-> println("$numero de $palo")
            1 -> println("As de $palo")
            11 -> println("Jack de $palo")
            12 -> println("Reina de $palo")
            13 -> println("Rey de $palo")
        }
    }

}

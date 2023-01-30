import kotlin.random.Random
class Carta(numero: Int, palo:Char) {
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
            if (valor=='c' || valor == 'p' || valor == 'r' || valor == 't'){
                field = valor
            }else{
                println("Palo erróneo")
            }
        }
        get():Char {
            when (field) {
                'c' -> field = "Corazones"
                'r' -> field = "Rombos"
                't' -> field = "Tréboles"
                'p' -> field = "Picas"
            }
            return field
        }

    constructor(otraCarta: Carta):this(otraCarta.numero, otraCarta.palo){}

    constructor():this(){
        numero = this.numero

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

    fun palo_aleatorio (): Char{
        val l = listOf<Char>('c', 'p', 't', 'r')
        return (l.get((0..3).random()))
    }

    fun numero_aleatorio(n:Int){
        val l = listOf<Char>('c', 'p', 't', 'r')
        if (n>=0 && n<=3){
            return (l.get(n))
        }else return l.get(0)
    }
    fun comparar_carta(otraCarta : Carta): Int {
        if (this.numero > otraCarta.numero) {
            this.mostrar_carta()
            return 1
        } else if (otraCarta.numero > this.numero) {
            otraCarta.mostrar_carta()
            return -1
        } else if (this.numero == otraCarta.numero) {
            if (this.palo > otraCarta.palo) {
                this.mostrar_carta()
                return 1
            } else if (otraCarta.palo > this.palo) {
                otraCarta.mostrar_carta()
                return -1
            } else if (this.palo == otraCarta.palo) {
                println("Empate")
                return 0
            }
        }
    }
}


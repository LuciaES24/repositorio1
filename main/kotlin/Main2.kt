fun main(){
    var carta1 = Carta(12,"t")
    carta1.mostrar_carta()

    var carta2 = Carta(7, "p")
    carta2.mostrar_carta()

    val cartas_a_comparar = listOf(carta1, carta2)
    carta1.comparar_carta(carta2)
}
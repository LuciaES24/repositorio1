class Baraja {
    var palos_posibles = listOf("c", "r", "p", "t")
    var numeros_posibles = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13)
    var carta_aleatoria = Carta(numeros_posibles.random(),palos_posibles.random())
}
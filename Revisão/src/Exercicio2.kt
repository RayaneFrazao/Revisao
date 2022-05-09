fun main() {
    val listaDois = mutableSetOf<Int>()

    listaDois.add(1)
    listaDois.add(5)
    listaDois.add(5)
    listaDois.add(6)
    listaDois.add(7)
    listaDois.add(8)
    listaDois.add(8)
    listaDois.add(8)

    println("Segunda Lista: ")
    println(listaDois)

}

// A diferença é que no exercicio anterior foi feito com list que permite repetir os elementos, e o segundo foi feito com set que não permite repetir os elementos.
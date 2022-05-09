import objetosCores.Objetos

fun main() {
    val objetos = Objetos()

    objetos.dicionarioObjetos.forEach { objetos, cor ->
        println("$objetos: $cor")
    }
}
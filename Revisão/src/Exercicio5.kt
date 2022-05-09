class Exercicio5 {

val dicionario = mapOf<String, List<String>>(
    "bola" to mutableListOf("azul"),
    "boneca" to mutableListOf("amarela"),
    "dado" to mutableListOf("rosa")
)
dicionario.forEach {
    println("${it.key} - ${it.value}")

 }

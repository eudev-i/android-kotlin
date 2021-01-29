package br.com.digitalhouse.exercicio1

fun main() {
    var lista = arrayListOf<String>()

    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")

//    println(lista.get(3))

    try {
        println(lista.get(3))
    }catch (ex : IndexOutOfBoundsException){
        println("Caiu na exceção")
        ex.localizedMessage
    }
}
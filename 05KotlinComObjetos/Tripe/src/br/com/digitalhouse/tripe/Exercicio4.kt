package br.com.digitalhouse.tripe

fun main() {
    val tripe = Tripe(120, 170)
    testeTripe(tripe)

    tripe.usar()
    testeTripe(tripe)

    tripe.guardar()
    testeTripe(tripe)

    tripe.desdobrar()
    tripe.definirAltura(135)
    testeTripe(tripe)
}

fun testeTripe(objeto: Tripe) {
    println("Tripé status!")
    println("Dobrado? -> ${if(objeto.dobrado) "sim" else "não"}")
    println("Altura atual -> ${objeto.alturaAtual}")
    println()
}
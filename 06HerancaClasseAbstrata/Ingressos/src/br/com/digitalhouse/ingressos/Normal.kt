package br.com.digitalhouse.ingressos

class Normal (override val valor : Double) : Ingresso{

    override fun imprimeValor() {
        println("O valor Normal é R$ ${valor}")
    }
}
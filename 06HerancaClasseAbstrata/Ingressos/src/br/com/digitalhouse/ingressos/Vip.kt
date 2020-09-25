package br.com.digitalhouse.ingressos

open class Vip (override val valor : Double):Ingresso {
    open val valorAdicional: Double = 0.0

    val ingressoVip: Double
        get() {
            return valor + valorAdicional
        }

    override fun imprimeValor() {
        println("O valor Vip é R$ ${ingressoVip}")
    }

}
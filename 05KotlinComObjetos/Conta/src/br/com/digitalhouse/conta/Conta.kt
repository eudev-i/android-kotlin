package br.com.digitalhouse.conta

class Conta (val numeroDaConta: Int, var saldo: Double, val titular: Cliente) {

    init {
        println("${titular.nome} criou a com ${saldo} reais no saldo")
    }

    fun deposito(quantia: Double) {
        this.saldo += quantia
        println("${titular.nome} depositou ${quantia} reais, o novo saldo é de ${saldo} reais.")
    }

    fun saque(quantia: Double){
        when {
            quantia > saldo -> println("Saldo insuficiente")
            else -> {
                this.saldo -= quantia
                println("${titular.nome} sacou ${quantia} reais, o novo saldo é de $saldo reias")
            }
        }
    }
}
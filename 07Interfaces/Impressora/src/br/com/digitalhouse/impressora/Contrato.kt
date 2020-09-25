package br.com.digitalhouse.impressora

class Contrato(override var nome: String, override var tipo: String) : Imprimivel {

    override fun imprimir() {
        println("Sou um contrato $nome do tipo $tipo")
    }
}
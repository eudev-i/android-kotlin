package br.com.digitalhouse.ingressos

class CamaroteInferior (valor: Double) : Vip(valor) {

    override fun imprimeValor() {
        println("Camarote Inferior")
        super.imprimeValor()
    }
}
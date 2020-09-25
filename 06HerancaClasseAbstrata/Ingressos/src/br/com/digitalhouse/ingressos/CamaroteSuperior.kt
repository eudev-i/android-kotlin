package br.com.digitalhouse.ingressos

class CamaroteSuperior (valor: Double, override val valorAdicional: Double) : Vip(valor) {

    override fun imprimeValor() {
        println("Camarote Superior")

        super.imprimeValor()
    }
}
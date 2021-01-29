package br.com.digitalhouse.fatura

open class Fatura(numeroItemFatura : Int, descricaoItem: String, quantItem: Int, precoUnitario: Double) {

    var numeroItem : Int
    var descricao: String
    var quantidade: Int = 0
    var preco: Double = 0.0

    init {
        this.numeroItem = numeroItemFatura
        this.descricao = descricaoItem

        if(quantItem > 0){
            this.quantidade = quantItem
        }

        if(precoUnitario > 0){
            this.preco = precoUnitario
        }

    }

    fun getTotalFatura(): Boolean {
        val  valorFatura = quantidade * preco
        return true
    }
}
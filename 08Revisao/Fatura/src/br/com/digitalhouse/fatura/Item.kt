package br.com.digitalhouse.fatura

class Item (numeroItemFatura : Int, descricaoItem: String, quantItem: Int, precoUnitario: Double) :
    Fatura(numeroItemFatura, descricaoItem, quantItem, precoUnitario){}
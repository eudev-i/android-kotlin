package br.com.digitalhouse.veiculos

class Concessionaria {
    var registroDeVendas = mutableMapOf<Cliente, Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        registroDeVendas[cliente] = Venda(cliente, veiculo, valor)
    }
}
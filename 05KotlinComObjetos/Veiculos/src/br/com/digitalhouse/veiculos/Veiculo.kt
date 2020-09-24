package br.com.digitalhouse.veiculos

data class Veiculo(
        val marca: String,
        val modelo: String,
        val anoDeFabricacao: Int,
        val cor: String,
        val quilometragem: Double
)
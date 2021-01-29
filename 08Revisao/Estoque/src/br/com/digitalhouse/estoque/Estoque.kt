package br.com.digitalhouse.estoque

class Estoque (var nome : String, val qtdAtual : Int, var qtdMinima : Int) {

    var atual : Int = 0
    var minima : Int = 0

    init {
        if(qtdAtual > 0 && qtdMinima > 0){
            this.atual = qtdAtual
            this.minima = qtdMinima
        } else {
            println("Não pode ser negativo")
        }
    }

    fun mudarNome(nome: String){
        this.nome = nome
        println(nome)
    }

    fun mudarQtdMinima(qtdMinima: Int){
        this.qtdMinima = qtdMinima
        println(qtdMinima)

    }

    fun repor(qtd: Int){
        //A função repor aumenta qtdAtual de acordo com o parâmetro qtd;
        if(qtdAtual > 0){
            atual + qtdAtual
            println(atual)
        }else{
            println("Não pode ser negativo")
        }
    }

    fun darBaixa (qtd: Int){
        //A função darBaixa diminui qtdAtual de acordo com o parâmetro qtd;
        if(qtdAtual > 0){
            atual - qtdAtual
            println(atual)
        }else{
            println("Não pode ser negativo")
        }
    }

    fun mostra(): String{
        //A função mostra() retorna uma String contendo o nome do produto, sua quantidade mínima, sua quantidade atual;
        if(qtdAtual > 0){
            return ("O nome do produto é ${nome}, quantidade minima: ${qtdMinima}, quantidade atual: ${atual}")
        }else{
            return ("Não pode ser negativo")
        }
    }

    fun precisaRepor(): Boolean{
        // A função precisaRepor retorna true caso a quantidade atual esteja menor ou igual à quantidade mínima e false, caso contrário.
        if(atual <= 0){
            return true
        }
            return false

    }

}
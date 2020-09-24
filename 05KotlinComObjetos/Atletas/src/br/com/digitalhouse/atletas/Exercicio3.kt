package br.com.digitalhouse.atletas

fun main() {
    val atleta1 : Atleta = Atleta("Carlos", 6, 21)
    val atleta2 : Atleta = Atleta("Jorge", 3, 10)

    val nivelFacil: Prova = Prova(3, 10)
    val nivelMedio: Prova = Prova(6, 20)
    val nivelDificil: Prova = Prova(10, 30)

    verificarAtletas(atleta1, nivelFacil)
    verificarAtletas(atleta1, nivelMedio)
    verificarAtletas(atleta1, nivelDificil)

    verificarAtletas(atleta2, nivelFacil)
    verificarAtletas(atleta2, nivelMedio)
    verificarAtletas(atleta2, nivelDificil)

}

fun verificarAtletas(atleta: Atleta, prova: Prova) {
    if(prova.podeRealizar(atleta) == true){
        println("${atleta.nome} consegue realizar a prova")
    }else{
        println("${atleta.nome} não consegue realizar a prova")
    }

}

package br.com.digitalhouse.ingressos

fun main() {
    var tipoIngresso =
            menu("O Ingresso é do tipo 1 - Normal ou 2 - Vip?")

    val ingresso =
            if(tipoIngresso == 1)
                Normal(25.0)
            else {
                var tipoCamarote = menu("Qual será o camarote: 1 - Superior ou 2 - Inferior")
                if(tipoCamarote == 1)  CamaroteSuperior(45.0, 15.0) else CamaroteInferior(45.0)
            }

    ingresso.imprimeValor()
}

fun menu(opcoes:String): Int {
    var opcao = 0;
    println(opcoes)

    do {
        opcao = readLine()?.toIntOrNull() ?: 0
        if(opcao !in 1..2) {
            println("[ERRO]: $opcoes")
            opcao = 0
        }
    } while (opcao == 0)

    return opcao
}
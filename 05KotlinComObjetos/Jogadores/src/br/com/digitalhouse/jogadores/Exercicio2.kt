package br.com.digitalhouse.jogadores

fun main(){

    val jogador1 = JogadorDeFutebol("João")
    val jogador2 = JogadorDeFutebol("Mateus")

    val sessaoDeTreinamento = SessaoDeTreinamento()

    sessaoDeTreinamento.treinarA(jogador1)
    jogador1.resultadoJogador()

    sessaoDeTreinamento.treinarA(jogador2)
    jogador2.resultadoJogador()
}
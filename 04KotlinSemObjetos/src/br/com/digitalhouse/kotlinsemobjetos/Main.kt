package br.com.digitalhouse.kotlinsemobjetos

fun main (){

    println("Exercício 1: ${maiorNum(18, 19, 7)}")
    println("Exercício 2: ${comparaTexto("agosto", "setembro")}")
    println("Exercício 3: ${numPar(4)}")
    println("Exercício 4: ${cemNumImpares()}")
    println("Exercício 5: ${analisaNumeros(9, 4, 8, 6)}")
    println("Exercício 6: ${cemNumPositivos()}")
}

//Escrever o código que deve analisar três números inteiros e retornar o maior deles.
fun maiorNum(num1: Int, num2: Int, num3: Int): Int {
    return maxOf(num1, num2, num3)
}

//Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
fun comparaTexto(texto1: String, texto2: String): Boolean {
    return texto1 != texto2
}

//Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.
fun numPar(num: Int): Boolean {
    return (num % 2) == 0
}

//Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.
fun cemNumImpares() {
    for (x in 1..200 step 2) {
        println(x)
    }
}

//Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.
fun analisaNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD);
}

//Escrever um programa que exiba os primeiros 100 números positivos.
fun cemNumPositivos() {
    for (x in 1..100) {
        println(x)
    }
}
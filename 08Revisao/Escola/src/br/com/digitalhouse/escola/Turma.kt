package br.com.digitalhouse.escola

class Turma (var nome: String, var curso: Curso) {

    fun consultarCurso(curso: Curso): Boolean{
        println("O curso da turma ${nome} é de ${curso.nome}")
        return true
    }
}
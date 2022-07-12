package br.com.impacta.laboratorio9

import br.com.impacta.laboratorio9.Classes.Aluno
import br.com.impacta.laboratorio9.Classes.Professor

fun main() {
    var aluno = Aluno(20020712L, "João", 13, arrayOf(6.0, 5.0, 6.5))
    println(aluno.avaliacao())

    var professor = Professor(20020711L, "Maria", 44, arrayOf(true, true, false))
    println(professor.avaliacao())
}
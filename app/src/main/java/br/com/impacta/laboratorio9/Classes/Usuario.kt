package br.com.impacta.laboratorio9.Classes

open class Usuario(
    var codigo: Long = 0L,
    var nome: String = "",
    var idade: Int = -1
) {
    open fun avaliacao(): String {
        return "TODO"
    }
}
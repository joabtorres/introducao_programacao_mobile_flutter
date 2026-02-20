package classe

class Pessoa {
    lateinit var nome: String
    var idade: Int = 0

    fun mostrarPessoa() {
        println("Instancia na mémoria: ${this}")
        println("Nome: ${this.nome}")
        println("Idade: ${this.idade} ano(s)")
    }

    fun eAdulto(): Boolean {
        return if (this.idade >= 18) true else false
    }
}
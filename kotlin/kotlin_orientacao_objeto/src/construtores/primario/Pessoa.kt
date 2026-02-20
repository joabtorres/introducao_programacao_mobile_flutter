package construtores.primario

class Pessoa(val nome: String, val idade: Int) {

    init {
        isAdult()
    }

    fun isAdult() {
        if (idade >= 18) {
            println("Maior de idade")
        } else {
            println("Menor de idade")
        }
    }

    fun showPessoa() {
        println("nome: ${nome}")
        println("idade: ${idade} anos")
    }

}



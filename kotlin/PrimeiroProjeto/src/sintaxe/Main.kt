package sintaxe

fun main() {
    val numbers = listOf<Int>(10, 5, 6, 8, 10, 66, 8, 12, 99954)
    //numbers.add(200) //ERRO: Não é possivel adicionar ou remover elementos

    val numbersMutable = numbers.toMutableList()
    numbersMutable.add(200) //Agora é possível adicionar e remove elementos
    println("Tamanho da lista de números: ${numbersMutable.size}")
    println("último número da lista imutavel: ${numbers.last()}")
    println("último número da lista mutavel: ${numbersMutable.last()}")

    println("\n ---------------- \n")

    val names = mutableListOf<String>("Joab", "Carla", "Victor", "Manoel")
    names.add("Maria")
    println("Primiro nome da lista: ${names.first()}")
    names.forEach{ name ->
        println("Nome: ${name.uppercase()}" )
    }
}


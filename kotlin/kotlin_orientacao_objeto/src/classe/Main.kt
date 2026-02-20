package classe

fun main() {
    val joab = Pessoa()
    joab.nome = "Joab Torres alencar"
    joab.idade = 90

    val carla = Pessoa()
    carla.nome = "Carla Barros"
    carla.idade = 17

    joab.mostrarPessoa()
    println("Joab é maior de idade? ${joab.eAdulto()}")
    println("")
    carla.mostrarPessoa()
    println("Carla é maior de idade? ${carla.eAdulto()}")
}
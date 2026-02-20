package null_safety

fun main() {

    var name: String? = null

    var tamanho = name?.length ?: 0

    //lateinit var idade:Int
   // lateinit var altura: Double
    lateinit var nome: String
    lateinit var notas: List<Double>
    lateinit var aluno: Aluno
    var aluno2 = Aluno()
}
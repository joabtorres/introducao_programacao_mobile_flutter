package sintaxe

//calcular uma lista de notas
fun calcularNotas(notas: List<Double>): Double {
    var somarnota: Double = 0.0
    notas.forEach { nota ->
        somarnota += nota
    }
    return somarnota / notas.size
}
//verifica o status da nota
fun statusNota(nota: Double): String {
    return if (nota >= 7) {
        "Aprovado"
    } else {
        "Faça a prova final e sua última chance"
    }
}
//calcula nota bimestral com a prova final
fun calcularProvaFinal(notas: List<Double>, provaFinal: Double): Double {
    val notabimestral = calcularNotas(notas)
    return (notabimestral + provaFinal) / 2
}

fun main() {
    val nome = "Joab Torres Alencar"
    val notas = listOf<Double>(7.0, 10.0, 3.9, 5.0)
    println("Aluno: ${nome}")
    println("Nota Geral: ${String.format("%.2f", calcularNotas(notas))}")
    println("Status: ${statusNota(calcularNotas(notas))}")
    println("Nota Geral + Prova Final: ${String.format("%.2f", calcularProvaFinal(notas, 8.0))}")
}

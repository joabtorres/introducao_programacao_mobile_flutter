//calcula um array notas
double calcularNotas(List<double> notas) {
  double somarNota = 0;
  notas.forEach((nota) {
    somarNota += nota;
  });
  return somarNota / notas.length;
}

// Verifica o status da nota
String statusNota(double nota) {
  if (nota >= 7) {
    return "Aprovado";
  } else {
    return "Faça a prova final é sua ultima chance";
  }
}

//calcula nota bimestral com a prova final
double calcularProvaFinal(List<double> notas, double provaFinal) {
  double notaBimestral = calcularNotas(notas);
  return (notaBimestral + provaFinal) / 2;
}

void main() {
  const String nome = "Joab Torres Alencar";
  final List<double> notas = [7.0, 10, 3.9, 5.0];
  print("Aluno: ${nome}");
  print('Nota Geral: ${calcularNotas(notas).toStringAsFixed(2)}');
  print("Status: ${statusNota(calcularNotas(notas))}");
  print("Nota Geral + Prova Final: ${calcularProvaFinal(notas, 8).toStringAsFixed(2)}");
}

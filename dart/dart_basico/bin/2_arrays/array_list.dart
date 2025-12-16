void main() {
  List<int> numbers = [10, 5, 6, 8, 10, 66, 8, 12, 9954];
  numbers.add(200);
  print("Tamanho da lista de números: ${numbers.length}");
  print("Ultimo Número: ${numbers.last}");
  print("Lista os valores: ${numbers.join(', ').toString()}");

  print("\n ------------------------- \n");

  List<String> names = ['Joab', 'Carla', 'Victor', 'Manoel'];
  names.add('Maria');
  print("Primeiro nome da lista: ${names.first}");
  names.forEach((name) {
    //vai percorrer o array enquanto houver índice
    print("Nome: ${name.toLowerCase()}");
  });
}

class Person {
  late String name;
  late int age;

  void showPerson() {
    print("Nome: ${this.name}");
    print("Idade: ${this.age} ano(s)");
  }

  bool isAdult() {
    return (this.age >= 18) ? true : false;
  }
}

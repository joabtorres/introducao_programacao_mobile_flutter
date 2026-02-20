class Person{
  String name;
  int age;
  Person(this.name, this.age);
}

void main (){
  Person p1 = Person("Carlos", 32);
  Person p2 = new Person("Ricardo", 19);

  print("A idade de ${p1.name} é ${p1.age}");
  print("A idade de ${p2.name} é ${p2.age}");
}
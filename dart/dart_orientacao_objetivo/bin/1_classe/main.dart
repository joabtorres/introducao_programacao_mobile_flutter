import 'person.dart';

void main() {
  Person joab = Person();
  joab.name = "Joab Torres";
  joab.age = 31;

  Person carla = new Person();
  carla.name = "Carla Barros";
  carla.age = 17;

  joab.showPerson();
  print("Joab Maior de idade? ${joab.isAdult()}");
  print("\n");
  carla.showPerson();
  print("Carla Maior de idade? ${carla.isAdult()}");
}

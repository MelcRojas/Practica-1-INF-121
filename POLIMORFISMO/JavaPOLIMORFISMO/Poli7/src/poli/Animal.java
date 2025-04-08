package poli;

//a) Clase abstracta Animal
abstract class Animal {
 public abstract String hacerSonido();  // b) Método a sobrecargar
 public abstract String moverse();      // c) Método a implementar
}

//b) Sobrecarga de hacerSonido()
//c) Implementación de moverse()

class Perro extends Animal {
 @Override
 public String hacerSonido() {
     return "Guau!";
 }

 @Override
 public String moverse() {
     return "El perro corre";
 }
}

class Gato extends Animal {
 @Override
 public String hacerSonido() {
     return "Miau!";
 }

 @Override
 public String moverse() {
     return "El gato salta";
 }
}

class Pajaro extends Animal {
 @Override
 public String hacerSonido() {
     return "Pío!";
 }

 @Override
 public String moverse() {
     return "El pájaro vuela";
 }
}


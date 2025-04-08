package poli;

//a) Instanciar 1 Perro, 1 Gato y 1 Pájaro en el main
public class Main {
public static void main(String[] args) {
   Animal[] animales = new Animal[3];
   animales[0] = new Perro();   // Perro
   animales[1] = new Gato();    // Gato
   animales[2] = new Pajaro();  // Pájaro

   // Mostrar comportamiento de cada animal
   for (Animal animal : animales) {
       System.out.println(animal.hacerSonido());  // b) Sonido característico
       System.out.println(animal.moverse());      // c) Cómo se mueve
   }
}
}

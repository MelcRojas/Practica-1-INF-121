package poli;

//Clase base
abstract class Bloque {
 String tipo;

 public Bloque(String tipo) {
     this.tipo = tipo;
 }

 public abstract void accion();

 public void colocar(String orientacion) {
     System.out.println("Colocando bloque " + tipo + " en la orientación: " + orientacion);
 }

 public abstract void romper();
}

//BloqueCofre
class BloqueCofre extends Bloque {
 int capacidad;
 int resistencia;

 public BloqueCofre(String tipo, int capacidad, int resistencia) {
     super(tipo);
     this.capacidad = capacidad;
     this.resistencia = resistencia;
 }

 @Override
 public void accion() {
     System.out.println("Abriendo BloqueCofre con capacidad " + capacidad);
 }

 @Override
 public void romper() {
     System.out.println("BloqueCofre roto. Objetos perdidos.");
 }
}

//BloqueTnt
class BloqueTnt extends Bloque {
 int daño;

 public BloqueTnt(String tipo, int daño) {
     super(tipo);
     this.daño = daño;
 }

 @Override
 public void accion() {
     System.out.println("Activando BloqueTnt. Daño: " + daño);
 }

 @Override
 public void romper() {
     System.out.println("¡BloqueTnt explota al romperse!");
 }
}

//BloqueHorno
class BloqueHorno extends Bloque {
 String color;
 int capacidadComida;

 public BloqueHorno(String tipo, String color, int capacidadComida) {
     super(tipo);
     this.color = color;
     this.capacidadComida = capacidadComida;
 }

 @Override
 public void accion() {
     System.out.println("Cocinando en BloqueHorno. Capacidad: " + capacidadComida);
 }

 @Override
 public void romper() {
     System.out.println("BloqueHorno roto. Comida perdida.");
 }
}


package poo;

//Archivo: Computadora.java

public class Computadora {
 // a) Componentes principales
 private String procesador;
 private int ram; // en GB
 private int almacenamiento; // en GB

 // b) Estado de la computadora
 private boolean encendida;

 // Constructor
 public Computadora(String procesador, int ram, int almacenamiento) {
     this.procesador = procesador;
     this.ram = ram;
     this.almacenamiento = almacenamiento;
     this.encendida = false; // Inicialmente apagada
 }

 // Encender computadora - c)
 public void encender() {
     if (!encendida) {
         encendida = true;
         System.out.println("La computadora se ha encendido.");
     } else {
         System.out.println("La computadora ya está encendida.");
     }
 }

 // Apagar computadora - c)
 public void apagar() {
     if (encendida) {
         encendida = false;
         System.out.println("La computadora se ha apagado.");
     } else {
         System.out.println("La computadora ya está apagada.");
     }
 }

 // a) Mostrar componentes
 public void mostrarComponentes() {
     System.out.println("Procesador: " + procesador);
     System.out.println("RAM: " + ram + " GB");
     System.out.println("Almacenamiento: " + almacenamiento + " GB");
 }

 // b) Mostrar estado
 public void mostrarEstado() {
     System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
 }

 // c) Simulación
 public static void main(String[] args) {
     Computadora miPc = new Computadora("Intel Core i7", 16, 512);
     miPc.mostrarComponentes(); // a)
     miPc.mostrarEstado();      // b)
     miPc.encender();           // c)
     miPc.mostrarEstado();      // b)
     miPc.apagar();             // c)
     miPc.mostrarEstado();      // b)
 }
}



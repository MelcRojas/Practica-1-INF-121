package poli;

//Clase Oficina
class Oficina {
 int nroSillas;
 int nroEscritorios;
 int nroEstanterias;

 Oficina(int sillas, int escritorios, int estanterias) {
     this.nroSillas = sillas;
     this.nroEscritorios = escritorios;
     this.nroEstanterias = estanterias;
 }

 // Inciso b: Método mostrar()
 void mostrar() {
     System.out.println("Oficina - Sillas: " + nroSillas + ", Escritorios: " + nroEscritorios + ", Estanterías: " + nroEstanterias);
 }

 // Inciso c: Método cantidadMuebles()
 int cantidadMuebles() {
     return nroSillas + nroEscritorios + nroEstanterias;
 }
}

//Clase Aula
class Aula {
 String nombre;
 int capacidad;
 int nroPupitres;

 Aula(String nombre, int capacidad, int pupitres) {
     this.nombre = nombre;
     this.capacidad = capacidad;
     this.nroPupitres = pupitres;
 }

 // Inciso b: Método mostrar()
 void mostrar() {
     System.out.println("Aula - Nombre: " + nombre + ", Capacidad: " + capacidad + ", Pupitres: " + nroPupitres);
 }

 // Inciso c: Método cantidadMuebles()
 int cantidadMuebles() {
     return nroPupitres;
 }
}

//Clase Laboratorio
class Laboratorio {
 String nombre;
 int capacidad;
 int nroMesas;
 int nroSillas;

 Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
     this.nombre = nombre;
     this.capacidad = capacidad;
     this.nroMesas = mesas;
     this.nroSillas = sillas;
 }

 // Inciso b: Método mostrar()
 void mostrar() {
     System.out.println("Laboratorio - Nombre: " + nombre + ", Capacidad: " + capacidad + ", Mesas: " + nroMesas + ", Sillas: " + nroSillas);
 }

 // Inciso c: Método cantidadMuebles()
 int cantidadMuebles() {
     return nroMesas + nroSillas;
 }
}

//Clase principal
public class Universidad {
 public static void main(String[] args) {
     // Inciso a: Instanciar 2 Oficinas, 2 Aulas y 1 Laboratorio
     Oficina o1 = new Oficina(4, 2, 1);
     Oficina o2 = new Oficina(3, 1, 2);

     Aula a1 = new Aula("Aula A", 30, 30);
     Aula a2 = new Aula("Aula B", 25, 25);

     Laboratorio l1 = new Laboratorio("Lab Física", 20, 10, 20);

     // Inciso b: Mostrar datos
     o1.mostrar();
     o2.mostrar();
     a1.mostrar();
     a2.mostrar();
     l1.mostrar();

     // Inciso c: Mostrar cantidad de muebles
     System.out.println("Total muebles Oficina 1: " + o1.cantidadMuebles());
     System.out.println("Total muebles Oficina 2: " + o2.cantidadMuebles());
     System.out.println("Total muebles Aula 1: " + a1.cantidadMuebles());
     System.out.println("Total muebles Aula 2: " + a2.cantidadMuebles());
     System.out.println("Total muebles Laboratorio: " + l1.cantidadMuebles());
 }
}

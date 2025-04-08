package poo1;

public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    // a) Constructor con nombre, edad y ciudad
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // a) Método para mostrar el saludo
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    // b) Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // c) Crear personas, mostrar saludo y verificar si son mayores de edad
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 20, "Madrid");
        Persona p2 = new Persona("Ana", 17, "Barcelona");
        Persona p3 = new Persona("Luis", 25, "Valencia");

        // Mostrar saludos
        p1.saludar();
        p2.saludar();
        p3.saludar();

        // Verificar si son mayores de edad
        System.out.println(p1.nombre + " es mayor de edad: " + p1.esMayorDeEdad());
        System.out.println(p2.nombre + " es mayor de edad: " + p2.esMayorDeEdad());
        System.out.println(p3.nombre + " es mayor de edad: " + p3.esMayorDeEdad());
    }
}

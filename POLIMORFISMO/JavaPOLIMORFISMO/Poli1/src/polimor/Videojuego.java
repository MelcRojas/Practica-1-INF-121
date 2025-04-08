package polimor;

public class Videojuego {
    // Atributos
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    // b) Constructor 1 - sin parámetros
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 0;
    }

    // b) Constructor 2 - con parámetros
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    // c) Método mostrar()
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
        System.out.println("-----------------------------------");
    }

    // d) agregarJugadores() - agrega 1 jugador
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }

    // d) agregarJugadores(int) - agrega N jugadores
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }

    // a) Método main para probar
    public static void main(String[] args) {
        // Crear 2 objetos de Videojuego (inciso a)
        Videojuego juego1 = new Videojuego("Minecraft", "PC", 4);
        Videojuego juego2 = new Videojuego(); // Usa constructor sin parámetros

        // Mostrar datos iniciales
        juego1.mostrar();
        juego2.mostrar();

        // Agregar jugadores usando sobrecarga (inciso d)
        juego1.agregarJugadores();      // +1 jugador
        juego2.agregarJugadores(3);     // +3 jugadores

        // Mostrar datos finales
        juego1.mostrar();
        juego2.mostrar();
    }
}

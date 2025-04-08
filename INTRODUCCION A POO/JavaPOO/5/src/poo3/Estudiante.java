package poo3;

public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // a) Método para calcular el promedio
    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    // b) Método para verificar si aprobó (promedio >= 6)
    public boolean aprobo() {
        return calcularPromedio() >= 6;
    }

    public void mostrarResultado() {
        String estado = aprobo() ? "Aprobó" : "No aprobó";
        System.out.printf("%s - Promedio: %.2f - %s%n", nombre, calcularPromedio(), estado);
    }

    public static void main(String[] args) {
        // c) Crear tres estudiantes y mostrar sus promedios y si aprobaron
        Estudiante est1 = new Estudiante("Ana", 8, 7);
        Estudiante est2 = new Estudiante("Luis", 5, 4);
        Estudiante est3 = new Estudiante("Carla", 6, 6);

        est1.mostrarResultado();
        est2.mostrarResultado();
        est3.mostrarResultado();
    }
}

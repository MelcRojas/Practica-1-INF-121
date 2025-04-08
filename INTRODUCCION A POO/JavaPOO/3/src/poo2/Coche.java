package poo2;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    // a) Método acelerar() que aumenta la velocidad en 10
    public void acelerar() {
        velocidad += 10;
    }

    // b) Método frenar() que disminuye la velocidad en 5
    public void frenar() {
        velocidad -= 5;
        if (velocidad < 0) velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Coche: " + marca + " " + modelo + " | Velocidad: " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        // c) Crear dos coches, acelerarlos, frenarlos y mostrar su velocidad
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Mustang");

        coche1.acelerar(); // +10
        coche1.acelerar(); // +10
        coche1.frenar();   // -5

        coche2.acelerar(); // +10
        coche2.frenar();   // -5
        coche2.frenar();   // -5 (mínimo 0)

        coche1.mostrarInfo();
        coche2.mostrarInfo();
    }
}


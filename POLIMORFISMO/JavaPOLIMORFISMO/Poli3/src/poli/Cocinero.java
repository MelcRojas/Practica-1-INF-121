package poli;

public class Cocinero {
    public String nombre;
    public int sueldoMes;
    public int horasExtra;
    public float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public int SueldoTotal() {
        return sueldoMes + (int)(horasExtra * sueldoHora);
    }

    public boolean sueldoIgualA(int x) {
        return sueldoMes == x;
    }
}

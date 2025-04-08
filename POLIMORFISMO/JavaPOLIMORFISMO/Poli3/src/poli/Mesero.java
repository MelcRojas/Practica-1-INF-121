package poli;

public class Mesero {
    public String nombre;
    public int sueldoMes;
    public int horasExtra;
    public float sueldoHora;
    public float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public int SueldoTotal() {
        return sueldoMes + (int)(horasExtra * sueldoHora + propina);
    }

    public boolean sueldoIgualA(int x) {
        return sueldoMes == x;
    }
}

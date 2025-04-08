package poli;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar 1 Cocinero, 2 Meseros y 2 Administrativos
        Cocinero cocinero = new Cocinero("Mario", 10000, 5, 100);

        Mesero mesero1 = new Mesero("Laura", 9000, 4, 80, 500);
        Mesero mesero2 = new Mesero("Juan", 8500, 6, 90, 400);

        Administrativo admin1 = new Administrativo("Ana", 9500, "Gerente");
        Administrativo admin2 = new Administrativo("Luis", 9500, "Contador");

        // b) Mostrar sueldo total
        System.out.println("== Sueldos Totales ==");
        System.out.println(cocinero.nombre + " (Cocinero): $" + cocinero.SueldoTotal());
        System.out.println(mesero1.nombre + " (Mesero): $" + mesero1.SueldoTotal());
        System.out.println(mesero2.nombre + " (Mesero): $" + mesero2.SueldoTotal());
        System.out.println(admin1.nombre + " (Administrativo): $" + admin1.SueldoTotal());
        System.out.println(admin2.nombre + " (Administrativo): $" + admin2.SueldoTotal());

        // c) Mostrar empleados con sueldoMes igual a X
        int X = 9500;
        System.out.println("\n== Empleados con sueldoMes igual a $" + X + " ==");

        if (cocinero.sueldoIgualA(X)) {
            System.out.println(cocinero.nombre + " (Cocinero)");
        }

        if (mesero1.sueldoIgualA(X)) {
            System.out.println(mesero1.nombre + " (Mesero)");
        }

        if (mesero2.sueldoIgualA(X)) {
            System.out.println(mesero2.nombre + " (Mesero)");
        }

        if (admin1.sueldoIgualA(X)) {
            System.out.println(admin1.nombre + " (Administrativo)");
        }

        if (admin2.sueldoIgualA(X)) {
            System.out.println(admin2.nombre + " (Administrativo)");
        }
    }
}

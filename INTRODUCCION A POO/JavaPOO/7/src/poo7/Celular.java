package poo7;

public class Celular {
    // Atributos
    private String[] aplicaciones;  // Espacio para 20 aplicaciones
    private int espacioDisponible;   // Espacio disponible en MB
    private int bateria;            // Porcentaje de batería
    private int cantidadAplicaciones; // Número de aplicaciones instaladas
    
    // Constructor
    public Celular() {
        aplicaciones = new String[20];  // Máximo 20 aplicaciones
        espacioDisponible = 1024;  // 1024MB
        bateria = 100;  // Batería inicial al 100%
        cantidadAplicaciones = 0;
    }
    
    // a) Método para instalar una nueva aplicación
    public void instalarAplicacion(String nombre, int pesoMB) {
        if (cantidadAplicaciones < 20 && espacioDisponible >= pesoMB) {
            aplicaciones[cantidadAplicaciones] = nombre;
            espacioDisponible -= pesoMB;
            cantidadAplicaciones++;
            System.out.println("Aplicación " + nombre + " instalada exitosamente.");
        } else {
            System.out.println("No se puede instalar la aplicación. Verifica el espacio disponible o el número de aplicaciones.");
        }
    }
    
    // b) Método para utilizar una aplicación
    public void utilizarAplicacion(String nombre, int tiempoUsoMinutos) {
        if (bateria <= 0) {
            // d) Cuando la batería se acaba, se muestra el mensaje de "Celular apagado"
            System.out.println("Celular apagado. La batería está agotada.");
            return;
        }
        
        int pesoApp = obtenerPesoAplicacion(nombre);
        
        if (pesoApp == -1) {
            System.out.println("Aplicación no encontrada.");
            return;
        }
        
        // Calcular el consumo de batería según el peso de la aplicación
        int porcentajeUso = 0;
        if (pesoApp > 250) {
            porcentajeUso = 5; // 5% por cada 10 minutos para apps más de 250MB
        } else if (pesoApp > 100) {
            porcentajeUso = 2; // 2% por cada 10 minutos para apps más de 100MB
        } else {
            porcentajeUso = 1; // 1% por cada 10 minutos para apps de menos de 100MB
        }
        
        int bateriaConsumida = (tiempoUsoMinutos / 10) * porcentajeUso;
        bateria -= bateriaConsumida;
        
        if (bateria < 0) {
            bateria = 0;
        }
        
        System.out.println("Usando la aplicación " + nombre + " por " + tiempoUsoMinutos + " minutos.");
        System.out.println("Batería restante: " + bateria + "%.");
    }
    
    // c) Mostrar el porcentaje de batería restante
    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%.");
    }
    
    // Método auxiliar para obtener el tamaño de la aplicación
    private int obtenerPesoAplicacion(String nombre) {
        // En un caso real, esto podría ser más sofisticado, pero asumimos que 
        // todas las aplicaciones pesan de forma ficticia según un nombre
        switch (nombre) {
            case "App1":
                return 50;
            case "App2":
                return 120;
            case "App3":
                return 300;
            default:
                return -1; // Aplicación no encontrada
        }
    }
    
    public static void main(String[] args) {
        Celular miCelular = new Celular();
        miCelular.instalarAplicacion("App1", 50);  // Instala App1
        miCelular.instalarAplicacion("App2", 120); // Instala App2
        
        miCelular.utilizarAplicacion("App1", 20); // Usa App1 por 20 minutos
        miCelular.utilizarAplicacion("App2", 20); // Usa App2 por 20 minutos
    }
}

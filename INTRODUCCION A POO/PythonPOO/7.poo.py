class Celular:
    # Constructor
    def __init__(self):
        self.aplicaciones = [None] * 20  # Espacio para 20 aplicaciones
        self.espacio_disponible = 1024   # 1024MB
        self.bateria = 100               # Batería inicial al 100%
        self.cantidad_aplicaciones = 0   # Número de aplicaciones instaladas
    
    # a) Método para instalar una nueva aplicación
    def instalar_aplicacion(self, nombre, peso_mb):
        if self.cantidad_aplicaciones < 20 and self.espacio_disponible >= peso_mb:
            self.aplicaciones[self.cantidad_aplicaciones] = nombre
            self.espacio_disponible -= peso_mb
            self.cantidad_aplicaciones += 1
            print(f"Aplicación {nombre} instalada exitosamente.")
        else:
            print("No se puede instalar la aplicación. Verifica el espacio disponible o el número de aplicaciones.")
    
    # b) Método para utilizar una aplicación
    def utilizar_aplicacion(self, nombre, tiempo_uso_minutos):
        if self.bateria <= 0:
            # d) Cuando la batería se acaba, se muestra el mensaje de "Celular apagado"
            print("Celular apagado. La batería está agotada.")
            return
        
        peso_app = self.obtener_peso_aplicacion(nombre)
        
        if peso_app == -1:
            print("Aplicación no encontrada.")
            return
        
        # Calcular el consumo de batería según el peso de la aplicación
        if peso_app > 250:
            porcentaje_uso = 5  # 5% por cada 10 minutos para apps más de 250MB
        elif peso_app > 100:
            porcentaje_uso = 2  # 2% por cada 10 minutos para apps más de 100MB
        else:
            porcentaje_uso = 1  # 1% por cada 10 minutos para apps de menos de 100MB
        
        bateria_consumida = (tiempo_uso_minutos // 10) * porcentaje_uso
        self.bateria -= bateria_consumida
        
        if self.bateria < 0:
            self.bateria = 0
        
        print(f"Usando la aplicación {nombre} por {tiempo_uso_minutos} minutos.")
        print(f"Batería restante: {self.bateria}%.")
    
    # c) Mostrar el porcentaje de batería restante
    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria}%.")
    
    # Método auxiliar para obtener el tamaño de la aplicación
    def obtener_peso_aplicacion(self, nombre):
        if nombre == "App1":
            return 50
        elif nombre == "App2":
            return 120
        elif nombre == "App3":
            return 300
        else:
            return -1  # Aplicación no encontrada

# Ejemplo de uso
if __name__ == "__main__":
    mi_celular = Celular()
    mi_celular.instalar_aplicacion("App1", 50)  # Instala App1
    mi_celular.instalar_aplicacion("App2", 120) # Instala App2
    
    mi_celular.utilizar_aplicacion("App1", 20)  # Usa App1 por 20 minutos
    mi_celular.utilizar_aplicacion("App2", 20)  # Usa App2 por 20 minutos

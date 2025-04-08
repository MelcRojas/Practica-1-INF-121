class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="Desconocida", cantidad_jugadores=0):
        # b) Constructor sobrecargado usando valores por defecto
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    # c) Método mostrar
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidad_jugadores}")
        print("-----------------------------------")

    # d) Método agregarJugadores() con "sobrecarga simulada"
    def agregar_jugadores(self, cantidad=1):
        self.cantidad_jugadores += cantidad


# a) Crear al menos 2 objetos
juego1 = Videojuego("Minecraft", "PC", 4)
juego2 = Videojuego()  # Usa constructor por defecto

# Mostrar estado inicial
juego1.mostrar()
juego2.mostrar()

# d) Agregar jugadores con 'sobrecarga'
juego1.agregar_jugadores()      # Agrega 1 jugador
juego2.agregar_jugadores(3)     # Agrega 3 jugadores

# Mostrar estado final
juego1.mostrar()
juego2.mostrar()

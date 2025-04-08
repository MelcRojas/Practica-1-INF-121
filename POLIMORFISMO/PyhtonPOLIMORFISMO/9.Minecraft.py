from abc import ABC, abstractmethod

# Clase base
class Bloque(ABC):
    def __init__(self, tipo):
        self.tipo = tipo

    @abstractmethod
    def accion(self):
        pass

    def colocar(self, orientacion):
        print(f"Colocando bloque {self.tipo} en la orientación: {orientacion}")

    @abstractmethod
    def romper(self):
        pass

# BloqueCofre
class BloqueCofre(Bloque):
    def __init__(self, tipo, capacidad, resistencia):
        super().__init__(tipo)
        self.capacidad = capacidad
        self.resistencia = resistencia

    def accion(self):
        print(f"Abriendo BloqueCofre con capacidad {self.capacidad}")

    def romper(self):
        print("BloqueCofre roto. Objetos perdidos.")

# BloqueTnt
class BloqueTnt(Bloque):
    def __init__(self, tipo, daño):
        super().__init__(tipo)
        self.daño = daño

    def accion(self):
        print(f"Activando BloqueTnt. Daño: {self.daño}")

    def romper(self):
        print("¡BloqueTnt explota al romperse!")

# BloqueHorno
class BloqueHorno(Bloque):
    def __init__(self, tipo, color, capacidadComida):
        super().__init__(tipo)
        self.color = color
        self.capacidadComida = capacidadComida

    def accion(self):
        print(f"Cocinando en BloqueHorno. Capacidad: {self.capacidadComida}")

    def romper(self):
        print("BloqueHorno roto. Comida perdida.")

# Ejecución
if __name__ == "__main__":
    cofre1 = BloqueCofre("Cofre", 20, 10)
    cofre2 = BloqueCofre("Cofre", 30, 15)

    tnt1 = BloqueTnt("TNT", 100)
    tnt2 = BloqueTnt("TNT", 200)

    horno1 = BloqueHorno("Horno", "Gris", 3)
    horno2 = BloqueHorno("Horno", "Negro", 5)

    cofre1.accion()
    cofre2.colocar("pared")
    cofre2.romper()

    tnt1.accion()
    tnt2.colocar("suelo")
    tnt2.romper()

    horno1.accion()
    horno2.colocar("pared")
    horno2.romper()

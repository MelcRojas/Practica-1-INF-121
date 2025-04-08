# a) Definición de clase base Animal
class Animal:
    def hacer_sonido(self):
        raise NotImplementedError("Este método debe ser sobreescrito por las subclases")

    def moverse(self):
        raise NotImplementedError("Este método debe ser sobreescrito por las subclases")

# b) Sobrecarga del método hacer_sonido() para cada animal
# c) Implementación del método moverse() para cada animal

class Perro(Animal):
    def hacer_sonido(self):
        return "Guau!"

    def moverse(self):
        return "El perro corre"

class Gato(Animal):
    def hacer_sonido(self):
        return "Miau!"

    def moverse(self):
        return "El gato salta"

class Pajaro(Animal):
    def hacer_sonido(self):
        return "Pío!"

    def moverse(self):
        return "El pájaro vuela"

# a) Instanciar 1 Perro, 1 Gato y 1 Pájaro
animales = [Perro(), Gato(), Pajaro()]

# Mostrar resultados usando polimorfismo
for animal in animales:
    print(animal.hacer_sonido())  # b) Sonido característico
    print(animal.moverse())       # c) Cómo se mueve

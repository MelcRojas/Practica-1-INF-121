# a) Definición de la clase Persona con nombre, edad y ciudad
class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    # a) Método para mostrar el saludo
    def saludar(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    # b) Método para verificar si es mayor de edad
    def es_mayor_de_edad(self):
        return self.edad >= 18

# c) Crear tres personas y mostrar saludos y mayoría de edad
p1 = Persona("Juan", 20, "Madrid")
p2 = Persona("Ana", 17, "Barcelona")
p3 = Persona("Luis", 25, "Valencia")

# Mostrar saludos
p1.saludar()
p2.saludar()
p3.saludar()

# Verificar si son mayores de edad
print(f"{p1.nombre} es mayor de edad: {p1.es_mayor_de_edad()}")
print(f"{p2.nombre} es mayor de edad: {p2.es_mayor_de_edad()}")
print(f"{p3.nombre} es mayor de edad: {p3.es_mayor_de_edad()}")

class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0

    # a) Método acelerar() que aumenta la velocidad en 10
    def acelerar(self):
        self.velocidad += 10

    # b) Método frenar() que disminuye la velocidad en 5
    def frenar(self):
        self.velocidad -= 5
        if self.velocidad < 0:
            self.velocidad = 0

    def mostrar_info(self):
        print(f"Coche: {self.marca} {self.modelo} | Velocidad: {self.velocidad} km/h")


# c) Crear dos coches, acelerarlos, frenarlos y mostrar su velocidad
coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Mustang")

coche1.acelerar()  # +10
coche1.acelerar()  # +10
coche1.frenar()    # -5

coche2.acelerar()  # +10
coche2.frenar()    # -5
coche2.frenar()    # -5 (mínimo 0)

coche1.mostrar_info()
coche2.mostrar_info()

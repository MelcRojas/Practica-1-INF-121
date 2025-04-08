# Clase Computadora

class Computadora:
    # a) Componentes principales
    def __init__(self, procesador, ram, almacenamiento):
        self.procesador = procesador
        self.ram = ram
        self.almacenamiento = almacenamiento
        self.encendida = False  # b) Estado inicial apagado

    # a) Mostrar componentes
    def mostrar_componentes(self):
        print(f"Procesador: {self.procesador}")
        print(f"RAM: {self.ram} GB")
        print(f"Almacenamiento: {self.almacenamiento} GB")

    # b) Mostrar estado
    def mostrar_estado(self):
        estado = "Encendida" if self.encendida else "Apagada"
        print(f"Estado: {estado}")

    # c) Encender
    def encender(self):
        if not self.encendida:
            self.encendida = True
            print("La computadora se ha encendido.")
        else:
            print("La computadora ya está encendida.")

    # c) Apagar
    def apagar(self):
        if self.encendida:
            self.encendida = False
            print("La computadora se ha apagado.")
        else:
            print("La computadora ya está apagada.")


# c) Simulación
mi_pc = Computadora("Intel Core i7", 16, 512)
mi_pc.mostrar_componentes()  # a)
mi_pc.mostrar_estado()       # b)
mi_pc.encender()             # c)
mi_pc.mostrar_estado()       # b)
mi_pc.apagar()               # c)
mi_pc.mostrar_estado()       # b)

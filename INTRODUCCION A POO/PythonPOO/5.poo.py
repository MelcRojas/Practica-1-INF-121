class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    # a) Método para calcular el promedio
    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    # b) Método para verificar si aprobó (promedio >= 6)
    def aprobo(self):
        return self.calcular_promedio() >= 6

# c) Crear tres estudiantes y mostrar sus promedios y si aprobaron
est1 = Estudiante("Ana", 8, 7)
est2 = Estudiante("Luis", 5, 4)
est3 = Estudiante("Carla", 6, 6)

estudiantes = [est1, est2, est3]
for est in estudiantes:
    promedio = est.calcular_promedio()
    estado = "Aprobó" if est.aprobo() else "No aprobó"
    print(f"{est.nombre} - Promedio: {promedio:.2f} - {estado}")

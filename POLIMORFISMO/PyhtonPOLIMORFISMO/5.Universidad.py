# Clase Oficina
class Oficina:
    def __init__(self, sillas, escritorios, estanterias):
        self.nroSillas = sillas
        self.nroEscritorios = escritorios
        self.nroEstanterias = estanterias

    # Inciso b: Método mostrar()
    def mostrar(self):
        print(f"Oficina - Sillas: {self.nroSillas}, Escritorios: {self.nroEscritorios}, Estanterías: {self.nroEstanterias}")

    # Inciso c: Método cantidad_muebles()
    def cantidad_muebles(self):
        return self.nroSillas + self.nroEscritorios + self.nroEstanterias

# Clase Aula
class Aula:
    def __init__(self, nombre, capacidad, pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroPupitres = pupitres

    # Inciso b: Método mostrar()
    def mostrar(self):
        print(f"Aula - Nombre: {self.nombre}, Capacidad: {self.capacidad}, Pupitres: {self.nroPupitres}")

    # Inciso c: Método cantidad_muebles()
    def cantidad_muebles(self):
        return self.nroPupitres

# Clase Laboratorio
class Laboratorio:
    def __init__(self, nombre, capacidad, mesas, sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = mesas
        self.nroSillas = sillas

    # Inciso b: Método mostrar()
    def mostrar(self):
        print(f"Laboratorio - Nombre: {self.nombre}, Capacidad: {self.capacidad}, Mesas: {self.nroMesas}, Sillas: {self.nroSillas}")

    # Inciso c: Método cantidad_muebles()
    def cantidad_muebles(self):
        return self.nroMesas + self.nroSillas

# Inciso a: Instanciar 2 Oficinas, 2 Aulas y 1 Laboratorio
o1 = Oficina(4, 2, 1)
o2 = Oficina(3, 1, 2)

a1 = Aula("Aula A", 30, 30)
a2 = Aula("Aula B", 25, 25)

l1 = Laboratorio("Lab Física", 20, 10, 20)

# Inciso b: Mostrar datos
o1.mostrar()
o2.mostrar()
a1.mostrar()
a2.mostrar()
l1.mostrar()

# Inciso c: Mostrar cantidad de muebles
print("Total muebles Oficina 1:", o1.cantidad_muebles())
print("Total muebles Oficina 2:", o2.cantidad_muebles())
print("Total muebles Aula 1:", a1.cantidad_muebles())
print("Total muebles Aula 2:", a2.cantidad_muebles())
print("Total muebles Laboratorio:", l1.cantidad_muebles())

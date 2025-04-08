class Empleado:
    def __init__(self, nombre, sueldoMes):
        self.nombre = nombre
        self.sueldoMes = sueldoMes

    def sueldo_total(self):
        return self.sueldoMes


class Cocinero(Empleado):
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        super().__init__(nombre, sueldoMes)
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldo_total(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)


class Mesero(Empleado):
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        super().__init__(nombre, sueldoMes)
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina


class Administrativo(Empleado):
    def __init__(self, nombre, sueldoMes, cargo):
        super().__init__(nombre, sueldoMes)
        self.cargo = cargo


# Instanciación de objetos (punto a)
c1 = Cocinero("Mario", 9000, 10, 150)
m1 = Mesero("Laura", 8500, 8, 120, 360)
m2 = Mesero("Juan", 8600, 5, 100, 340)
a1 = Administrativo("Ana", 9500, "Contadora")
a2 = Administrativo("Luis", 9500, "Gerente")

empleados = [c1, m1, m2, a1, a2]

# Mostrar sueldos totales (punto b)
print("== Sueldos Totales ==")
for emp in empleados:
    print(f"{emp.nombre} ({emp.__class__.__name__}): ${emp.sueldo_total()}")

# Mostrar empleados con sueldoMes igual a X (punto c)
X = 9500
print(f"\n== Empleados con sueldoMes igual a ${X} ==")
for emp in empleados:
    if emp.sueldoMes == X:
        print(f"{emp.nombre} ({emp.__class__.__name__})")

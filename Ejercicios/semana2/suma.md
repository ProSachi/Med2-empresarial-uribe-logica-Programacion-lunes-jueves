# Ejercicio: Facturación de restaurante
Se requiere la base y la altura. La fórmula matemática es Área = base * altura.
## Pseudocódigo
```text
INICIO CalcularArea
	DEFINIR plato1, plato2, plato3 COMO REAL
	DEFINIR subtotal, propina, impuestos, totalPagar COMO REAL
	ESCRIBIR "Ingrese el valor del plato 1:"
	LEER plato1
	ESCRIBIR "Ingrese el valor del plato 2:"
	LEER plato2
	ESCRIBIR "Ingrese el valor del plato 3:"
	LEER plato3
	subtotal <- plato1 + plato2 + plato3
	propina <- subtotal * 0.10
	impuestos <- subtotal * 0.19
	totalPagar <- subtotal + propina + impuestos
	ESCRIBIR "Subtotal: ", subtotal
	ESCRIBIR "Propina (10%): ", propina
	ESCRIBIR "Impuestos (19%): ", impuestos
	ESCRIBIR "Total a pagar: ", totalPagar
FIN
```

## Diagrama de flujo (texto)

```text
INICIO
	↓
Ingresar valor Plato 1
	↓
Ingresar valor Plato 2
	↓
Ingresar valor Plato 3
	↓
Calcular Subtotal = Plato1 + Plato2 + Plato3
	↓
Calcular Propina = Subtotal × 0.10
	↓
Calcular Impuestos = Subtotal × 0.19
	↓
Calcular Total = Subtotal + Propina + Impuestos
	↓
Mostrar Subtotal
	↓
Mostrar Propina
	↓
Mostrar Impuestos
	↓
Mostrar Total a pagar
	↓
FIN
```

INICIO
//entrada
Definir SUELDOFIJO = 2200000 DECIMAL
Definir COMISION = 0.03 DECIMAL
Definir totalVentas como decimal
Definir liquidacion como decimal

//Proceso
escribir "Ingrese el valor de las ventas totales del mes"
leer totalVentas
liquidacion = totalVentas * comision

//salida
Imprimir "La liquidación es: " + liquidacion
Imprimir "El sueldo es: " + SUELDOFIJO
Imprimir "El pago total es: " + (SUELDOFIJO + liquidacion)
FIN
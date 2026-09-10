INICIO conversionPesosDolare
	DEFINIR pesos, dolares,  decimales.
	DEFINIR valorConversion <- 0.00032
	DEFINIR tasaComision <- 0.02
	ESCRIBIR "Ingrese los pesos a convertir"
  	LEER pesos

	dolares <- (pesos * valorConversacion) 

	dolares <- dolares - (dolares * tasaComision)

	IMPRIMIR "Los pesos a cambio son: " + dolares
	IMPRIMIR "La comisión es: " + (dolares * tasaComision)
	
FIN
```

Algoritmo para calcular el rendimiento de combustible y costo por kilómetro en una empresa de transportes. Para un carro especifico. tanque lleno.
Inicio calculoCombustible
//Entrada
definir kilometrosRecorridos decimal;
definir const TAMANIODEPOSITO=12 decimal;
definir const PRECIOCOMBUSTIBLE=16800.80 decimal; 
definir rendimientoCombustibleKilometro decimal;
definir costoCombustibleKilometro decimal; 
//Proceso
escribir "Ingresa los kilometros recorridos";
leer kilometrosRecorridos; 
rendimientoCombustibleKilometro =  TAMANIODEPOSITO / kilometrosRecorridos;
costoCombustibleKilometro = PRECIOCOMBUSTIBLE * rendimientoCombustibleKilometro;
//Salida
escribir "El rendimiento del Combustible por kilometro es: " + rendimientoCombustibleKilometro + " galones por kilometros.";
escribir "El costo del combustible por kilometro es: " + costoCombustibleKilometro;
Fin calculoCombustible










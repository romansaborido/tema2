package boletin5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable numero donde almacenaremos el numero que introduzca el usuario y del que se realizara la tabla
		int numero;
		
		// Creamos la variable numeroMultiplicar donde almacenaremos el numero por el que vamos a multiplicar
		int numeroMultiplicar = 0;
		
		// Creamos la variable multiplicacion donde almacenaremos el resultado de la multiplicacion
		int multiplicacion;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		// Creamos el bucle: realizamos el bloque de instrucciones mientras que el numeroMultiplicar sea menor que 10 
		do {
			// Incrementamos la variable numeroMultiplicar
			++numeroMultiplicar;
			
			// Calculamos la multiplicacion y almacenamos el resultado en la variable multiplicacion
			multiplicacion = numero * numeroMultiplicar;
			
			// Mostramos la tabla de multiplicar
			System.out.println(numero + " x " + numeroMultiplicar + " = " + multiplicacion);
			
		// Mientras que el numero sea menor que 10, el bucle se seguira ejecutando	
		} while (numeroMultiplicar < 10);
		
		// Cerramos el scanner
		reader.close();

		
	}

}

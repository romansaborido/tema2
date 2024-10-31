package boletinbucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable numeroLimite para almacenar el numero que introduzca el usuario
		int numeroLimite;
		
		// Creamos la variable divisor para ir comprobando 
		int divisor = 2;

		// Creamos el booleano espPrimo para almacenar si finalmente es primo o no
		boolean esPrimo;

		// Creamos una variable contador para almacenar el numero de numeros primos
		int contador = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el numero limite al usuario
		System.out.println("Introduzca el número máximo:");
		numeroLimite = reader.nextInt();
		
		// Sacamos los numeros desde el 2 hasta el numero limite
		for (int i = 2; i <= numeroLimite; i++) {
			
			// Inicializamos a true al inicio de cada iteracion 
			esPrimo = true;
			
			// Inicializamos divisor a 2
			divisor = 2;
			
			// Mientras que divisor sea menor o igual a la raiz cuadrada del numero
			while (divisor <= Math.sqrt(i) && esPrimo) {
				
				// Si el número es divisible por i no es primo
				if (i % divisor == 0) {
					esPrimo = false;
				}
				// Incrementamos divisor para probar con el siguiente
				divisor++;
			}

			// Si el número es primo incrementamos la variable contador
			if (esPrimo) {
				contador++;
			}

		}

		// Mostramos el resultado al usuario
		System.out.println("Número de números primos: " + contador);
		
		// Cerramos el scanner
		reader.close();

		
	}

}
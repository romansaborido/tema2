package boletin6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable contador para almacenar el numero de numeros por los que es divisible el numero introducido por el usuario
		int contador = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario, mientras que no introduzca un numero entero positivo, se le seguira preguntando
		do {
			System.out.println("¡Introduzca un número! Te diré si es primo o no");
			numero = reader.nextInt();
		} while (!(numero > 0));
		
		// Mientras que i sea mayor o igual que 1 decrementamos su valor
		for (int i = numero ; i >= 1 ; i--) {
			
			// Si el numero es divisible por su numero anterior incrementamos el valor de contador
			if (numero % i == 0) {
				contador++;
			}
		}

		// Mostramos el resultado. Si el contador es igual a 2 el numero es primo si no, no lo es
		if (contador == 2) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		// Cerramos el scanner
		reader.close();
	}

}

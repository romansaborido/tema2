package boletin6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos la variable A donde almacenaremos el primer numero que introduzca el usuario
		int A;
		
		// Creamos la variable B donde almacenaremos el segundo numero que introduzca el usuario
		int B;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Pedimos el numero A y B al usuario, mientras que el valor de A y B sean iguales se le seguirá preguntando
		do {
			
			System.out.println("Introduzca el valor de A");
			A = reader.nextInt();

			System.out.println("Introduzca el valor de B");
			B = reader.nextInt();
			
		} while (A == B);
		
		
		// Si A es mayor que B, mostramos los numeros que hay de A a B
		if (A > B) {
			System.out.print("A -> ");
			
			// Mientras que i sea mayor que B decrementamos su valor
			for (int i = A - 1; i > B ; i--) {
				
				// Si i no es igual a B + 1, mostramos i de la siguiente manera
				if (i != B + 1) {
					System.out.print(i + ", ");
				}
				
				// Si i es igual a B, mostramos i de la siguiente manera
				if (i == B + 1) {
					System.out.print(i + " <- B");
				}
			}
			
		} else {
			System.out.print("B -> ");
			
			// Mientras que i sea mayor que A decrementamos su valor
			for (int i = B - 1; i > A ; i--) {
				
				// Si i no es igual a A + 1, mostramos i de la siguiente manera
				if (i != A + 1) {
					System.out.print(i + ", ");
				}
				
				// Si i es igual a A, mostramos i de la siguiente manera
				if (i == A + 1) {
					System.out.print(i + " <- A");
				}
			}
		}
		

		// Cerramos el scanner
		reader.close();
		
		
	}

}

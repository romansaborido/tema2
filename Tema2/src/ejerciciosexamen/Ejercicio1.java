package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable lado donde almacenaremos el numero que introduzca el usuario
		int lado;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el lado al usuario
		System.out.println("Introduzca el lado de un cuadrado. Te lo representaré");
		lado = reader.nextInt();
		
		// Numero de linea 
		for (int i = 1 ; i <= lado ; i++) {
			
			// Si el numero de linea es 1 o es igual al lado
			if (i == 1 || i == lado) {
				
				// Imprimimos asteriscos en la misma linea como numero tenga el lado
				for (int j = 1 ; j <= lado ; j++) {
					System.out.print("*");
				}
				
			// Salto de linea
			System.out.println();
			
			// Si el numero de linea no es 1 ni es lado
			} else {
				
				// Imprimimos un asterisco
				System.out.print("*");
				
				// Imprimimos espacios en la misma linea hasta lado - 2
				for (int k = 1 ; k <= lado - 2 ; k++) {
					System.out.print(" ");
				}
				
			// Imprimimos el ultimo asterisco y un salto de linea
			System.out.print("*");
			System.out.println();
			
			}
			
		}

		// Cerramos el scanner
		reader.close();
		
		
	}

}
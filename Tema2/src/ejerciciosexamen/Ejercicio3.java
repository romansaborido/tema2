package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/* Creamos la variable base para almacenar el numero que introduzca el usuario que sera la base del
		triangulo */
		int base;
		
		// Creamos la variable espaciosDentro para almacenar el numero de espacios interiores por cada linea
		int espaciosDentro;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos la base al usuario
		System.out.println("Introduzca la base de un triángulo. Te lo representaré invertido");
		base = reader.nextInt();
		
		// Numero de linea
		for (int i = 1 ; i <= base ; i++) {
			
			// Si el numero de linea es igual a 1
			if (i == 1) {
				
				// Imprimimos asteriscos y espacio en la misma linea como numero tenga la base
				for (int j = 1 ; j <= base ; j++) {
					System.out.print("* ");
				}
			
				// Salto de linea
				System.out.println();
			
			// Si linea no es 1
			} else {
				
				// Imprimimos espacios hasta linea - 1
				for (int k = 1 ; k <= i - 1 ; k++) {
					System.out.print(" ");
				}
			
				// Imprimimos en la misma linea un asterisco
				System.out.print("*");
					
				// Inicializamos espaciosDentro a (base - i) * 2 - 1
				espaciosDentro = (base - i) * 2 - 1;
			
				// Imprimimos espacios hasta espaciosDentro
				for (int l = 0 ; l < espaciosDentro ; l++) {
					System.out.print(" ");
				}
				
				// Si i no es igual a base imprimimos el asterisco de la derecha
				if (i != base) {
				System.out.print("*");
				}
				
				// Salto de linea
				System.out.println();
			
			}
			
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

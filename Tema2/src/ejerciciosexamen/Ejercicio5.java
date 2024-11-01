package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable tamaño para almacenar el numero del tamaño del escaque que introduzca el usuario 
		int tamaño;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el tamaño al usuario
		System.out.println("Introduzca el tamaño del escaque. Te representaré el tablero completo");
		tamaño = reader.nextInt();
		
		// Numero de fila
		for (int i = 1 ; i <= 8 ; i++) {
			
			// Si i (numero de fila) es impar
			if (i % 2 != 0) {
			
				// Ejecutamos los bucles interiores hasta el numero que contenga tamaño
				for (int j = 1 ; j <= tamaño ; j++) { 
					
					// Ejecutamos los bucles interiores hasta el numero que contenga tamaño * 2
					for (int k = 1 ; k <= tamaño * 2 ; k++) {	
						
						// Imprimimos espacios hasta el numero que contenga tamaño
						for (int l = 1 ; l <= tamaño ; l++) {
							System.out.print(" ");
						}
						
						// Imprimimos almohadillas hasta el numero que contenga tamaño
						for (int m = 1 ; m <= tamaño ; m++) {
							System.out.print("#");
						}
					}
					
					// Salto de linea
					System.out.println();
				}
				
			// Si i (numero de fila) es par
			} else {
				
				// Ejecutamos los bucles interiores hasta el numero que contenga tamaño
				for (int j = 1 ; j <= tamaño ; j++) { 
					
					// Ejecutamos los bucles interiores hasta el numero que contenga tamaño * 2
					for (int k = 1 ; k <= tamaño * 2 ; k++) {	
						
						// Imprimimos almohadillas hasta el numero que contenga tamaño
						for (int l = 1 ; l <= tamaño ; l++) {
							System.out.print("#");
						}
							
						// Imprimimos espacios hasta el numero que contenga tamaño
						for (int m = 1 ; m <= tamaño ; m++) {
							System.out.print(" ");
						}
					}
				
					// Salto de linea
					System.out.println();
				}	
			}
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

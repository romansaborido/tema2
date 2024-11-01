package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable lado para almacenar el numero que introduzca el usuario (lado hexagono)
		int lado;
		
		// Creamos la variable filas para almacenar el numero de filas que va a tener el hexagono
		int filas;
		
		// Creamos la variable columnas para almacenar el numero de columnas que va a tener el hexagono
		int columnas;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el lado al usuario
		System.out.println("Introduzca el lado de un hexágono. Te lo representaré");
		lado = reader.nextInt();
		
		// Numero de filas
		filas = lado * 2 - 1;
		
		// Numero de columnas
		columnas = filas + lado - 1;
		
		// Numero de filas decreciente de las primeras tres filas
		for (int i = filas - lado ; i >= 1 ; i--) {
			
			// Imprimimos un numero de espacios hasta i (numero de fila actual)
			for (int j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			
			// Imprimimos un numero de asteriscos hasta columnas - i * 2 (numero de fila actual * 2)
			for (int k = 1 ; k <= columnas - i * 2 ; k++) {
				System.out.print("*");
			}
			
			// Salto de linea
			System.out.println();
			
		}
		
		// Imprimimos asteriscos hasta el numero de columnas
		for (int i = 1 ; i <= columnas ; i++) {
			System.out.print("*");
		}
		
		// Salto de linea
		System.out.println();
		
		// Numero de filas creciente de las ultimas tres filas
		for (int i = 1 ; i <= filas - lado ; i++) {
			
			// Imprimimos un numero de espacios hasta i (numero de fila actual)
			for (int j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			
			// Imprimimos un numero de asteriscos hasta columnas - i * 2 (numero de fila actual * 2)
			for (int k = columnas - i * 2 ; k >= 1 ; k--) {
				System.out.print("*");
			}
			
			// Salto de linea
			System.out.println();
		}
		
		// Cerramos el scanner
		reader.close();

		
	}
	
}

package boletinbucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable numeroLimite donde almacenaremos el numero que introduzca el usuario
		int numeroLimite;
		
		// Creamos el booleano esPrimo donde almacenaremos si el numero es primo o no 
		boolean esPrimo;
		
		// Creamos una variable contador donde almacenaremos el numero de primos que hay
		int contador = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el valor de n al usuario, mientras que introduzca un numero menor que 1, se le seguira preguntando
		do {
			System.out.println("Introduzca un número y te diré cuantos números primos hay entre el 1 y tu número");
			numeroLimite = reader.nextInt();
		} while (numeroLimite <= 1);
		
		// Creamos el primer bucle para sacar los numeros que hay desde el 1 al numeroLimite
		for (int i = numeroLimite ; i >= 1 ; i--) {
			
			for (int j = 1 ; j <= numeroLimite ; j++) {
				if (i % j == 0) {
					contador++;
				}
				i--;
			}
		}
			
		
		// Mostramos los resultados
		System.out.println("Desde el 1 hasta el " + numeroLimite + " hay " + contador + " números primos");
		
		
	}

}

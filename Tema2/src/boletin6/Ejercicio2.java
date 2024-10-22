package boletin6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable n donde almacenaremos el numero que introduzca el usuario
		int n;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario
		System.out.println("Aprende los múltiplos de tres con este programa! Introduzca un número");
		n = reader.nextInt();
		
		// Creamos el bucle
		for (int i = 1 ; i<=n ; i += 3) {
			System.out.println(i);
		}
		
		// Cerramos el scanner
		reader.close();

		
	}

}

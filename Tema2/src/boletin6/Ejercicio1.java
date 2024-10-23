package boletin6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable n donde almacenaremos el numero que introducira el usuario
		int n;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero n al usuario
		System.out.println("¡Aprende a contar con este programa! Introduzca un número");
		n = reader.nextInt();
		
		// Mientras que la i sea menor o igual a n incrementamos su valor
		for (int i = 1 ; i<=n ; i++) {
			
			// Imprimimos el valor de i
			System.out.println(i);
		};
		
		// Cerramos el scanner
		reader.close();
	
		
	}

}

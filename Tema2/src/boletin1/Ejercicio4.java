package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable a para almacenar el número entero que introduzca el usuario 
		int a;
		
		// Creamos la variable b para almacenar el número entero que introduzca el usuario 
		int b;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el valor de a 
		System.out.println("Introduzca el valor de a");
		a = reader.nextInt();
		
		// Pedimos al usuario que introduzca el valor de b
		System.out.println("Introduzca el valor de b");
		b = reader.nextInt();
		
		/* Creamos la condición:
		if: a es menor que b imprime por consola "1.a 2.b"
		else: "1.b 2.a" 
		*/
		if (a == b) {
			System.out.println("a y b son iguales");
		} else if (a < b) {
			System.out.println("Ordenamos de menor a mayor:");
			System.out.println("1. " + a);
			System.out.println("2. " + b);
		} else {
			System.out.println("Ordenamos de menor a mayor:");
			System.out.println("1. " + b);
			System.out.println("2. " + a);
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}
}

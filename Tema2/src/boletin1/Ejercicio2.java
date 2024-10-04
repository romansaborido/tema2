package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable del primer número que vamos a pedir al usuario 
		int a;
		
		// Creamos la variable del segundo número que vamos a pedir al usuario
		int b;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que establezca el valor de a
		System.out.println("Introduzca el valor de a");
		a = reader.nextInt();
		
		// Pedimos al usuario que establezca el valor de b
		System.out.println("Introduzca el valor de b");
		b = reader.nextInt();
		
		/* Creamos la condición: si los números son iguales imprime por consola "a y b son iguales", si no son iguales imprime por
		consola "a y b no son iguales" */
		if (a == b) {
			System.out.println("a y b son iguales");
		} else {
			System.out.println("a y b no son iguales");
		}
		
		// Cerramos el scanner
		reader.close();
		
	
	}

}

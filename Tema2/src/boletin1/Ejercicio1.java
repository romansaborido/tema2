package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable del número que vamos a pedir al usuario 
		int numero;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Solicitamos al usuario que introduzca el número 
		System.out.println("Introduce un número");
		numero = reader.nextInt();
		
		/* Creamos la condición: si el número es par que imprima por consola "El número que has introducido es impar" o Si el número
		es impar que imprima por consola "El número que has introducido es impar"*/
		if (numero % 2 == 0) {
			System.out.println("El número que has introducido es par");
		} else {
			System.out.println("El número que has introducido es impar");
		}
		
		// Cerramos el scanner
		reader.close();
	
	
	}
}


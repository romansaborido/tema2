package boletin3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el número que introducirá el usuario
		int numero;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el número
		System.out.println("Introduzca un número entero comprendido entre 0 y 9999");
		numero = reader.nextInt();
		
		// if (numero < 0 || numero > 9999) 
		if (numero < 0 || numero > 9999) {
			System.out.println("Introduzca un número válido");
			
		} else if (numero >= 0 && numero <= 9) {
			System.out.println("El número es capicúa");
			
		} else if (numero >= 10 && numero <= 99) {
			// Comprobamos si el número es capicúa
			if ((int)numero / 10 == numero % 10) {
				System.out.println("El número es capicúa");
			} else {
				System.out.println("El número no es capicúa");
			}
			
		} else if (numero >= 100 && numero <= 999) {
			// Comprobamos si el número es capicúa
			if ((int)numero / 100 == numero % 10) {
				System.out.println("El número es capicúa");
			} else {
				System.out.println("El número no es capicúa");
			}
			
		} else if (numero >= 1000 && numero <= 9999) {
			// Comprobamos si el número es capicúa
			if (((int)numero / 1000 == numero % 10) && ((int)numero / 100 % 10 == (int)numero / 10 % 10)) {
				System.out.println("El número es capicúa");
			} else {
				System.out.println("El número no es capicúa");
			}

		}
		
		// Cerramos el scanner
		reader.close();

		
	}
	
}

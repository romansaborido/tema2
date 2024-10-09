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
		} else {
			if (numero >= 0 && numero <= 9) {
				System.out.println("El número es capicúa");
			} if else {
		}
		
		

	}

}

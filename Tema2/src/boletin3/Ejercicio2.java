package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable numero donde almacenaremos el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable valorAbsoluto donde almacenaremos el valor que nos devuelva el ternario
		int valorAbsoluto;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero y lo almacenamos
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		// Calculamos el valor absoluto
		valorAbsoluto = numero < 0 ? -numero : numero;
		
		// Mostramos el resultado
		System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto);
		
		// Cerramos el scanner
		reader.close();
		

	}
	
}

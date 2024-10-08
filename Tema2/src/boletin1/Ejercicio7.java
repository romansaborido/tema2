package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos una variable para almacenar el número entero que introducirá el usuario
		int numero;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el número mediante un syso
		System.out.println("Introduzca un número entero entre el 0 y el 99999");
		numero = reader.nextInt();
		
		// Si el número está comprendido entre el 0 y el 99999 que compruebe cuantas cifras tiene, sino que muestre un aviso al usuario por consola
		if (numero >= 0 && numero <= 99999) {
			} if (numero >= 0 && numero <= 9) {
					System.out.println("El número " + numero + " tiene una cifra");
				} else if (numero >= 10 && numero <= 99) {
					System.out.println("El número " + numero + " tiene dos cifras");
				} else if (numero >= 100 && numero <= 999) {
					System.out.println("El número " + numero + " tiene tres cifras");
				} else if (numero >= 1000 && numero <= 9999) {
					System.out.println("El número " + numero + " tiene cuatro cifras");
				} else if (numero >= 10000 && numero <= 99999) {
					System.out.println("El número " + numero + " tiene cinco cifras");
				} else { 
					System.out.println("Introduzca un número del 0 al 99999 (0 y 99999 inclusive)"); 
				} 
		
		// Cerramos el scanner
		reader.close();
			
		
	}
}

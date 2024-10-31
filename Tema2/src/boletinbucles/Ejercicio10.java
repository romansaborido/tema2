package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos la variable numero para almacenar el numero que introduzca el usuario
		int numero = 0;

		// Creamos la variable numeroReves para ir almacenando el numero al reves
		int numeroReves = 0;

		// Creamos la variable ultima cifra para ir almacenando la ultima cifra del numero
		int ultimaCifra;

		// Creamos la variable division para ir almacenando las divisiones
		int division;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el numero al usuario. Mientras que introduzca un numero menor que 0 se le seguira preguntando
		do {
			try {

				// Pedimos el numero al usuario
				System.out.println("Introduzca un número positivo:");
				numero = reader.nextInt();

				// Creamos la siguiente asercion
				assert numero >= 0 : "Introduzca un numero entero";

			// Creamos los mensajes de errores
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un numero entero mayor que 0");

			// Limpiamos el buffer
			} finally {
				reader.nextLine();
			}
		} while (numero < 0);

		
		// Asignamos el valor de numero a division
		division = numero;

		
		// Mientras que division sea mayor que 0
		while (division > 0) {

			// Sacamos la ultima cifra
			ultimaCifra = division % 10;

			// Sacamos el numero al reves
			numeroReves = numeroReves * 10 + ultimaCifra;

			// Dividimos para sacar cifras
			division /= 10;
		}

		
		// Si numeroReves es igual que numero
		if (numeroReves == numero) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa");
		}

		
		// Cerramos el scanner
		reader.close();

	}

}
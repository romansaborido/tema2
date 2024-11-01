package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que nos introduzca el usuario
		int numero = 0;
		
		// Creamos la variable contadorCifras para almacenar el numero de veces que comprobamos dentro del bucle y asi determinar el numero de cifras
		int contadorCifras = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Pedimos el numero al usuario. Mientras que el numero sea menor o igual que 0 se le seguira preguntando
		do {
			try {
				
				// Pedimos el numero al usuario
				System.out.println("Introduzca un número. Te diré cuantas cifras tiene");
				numero = reader.nextInt();
				
				// Creamos la siguiente asercion
				assert (numero > 0) : "Introduzca un número mayor que 0";
				
			// Creamos los mensajes de error
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero positivo");
				
			// Limpiamos el buffer
			} finally {
				reader.nextLine();
			}
		} while (numero <= 0);
			
		
		while (numero > 0) {
			numero /= 10;
			contadorCifras++;
		}
		
		// Mostramos el resultado
		System.out.println("El número que has escrito tiene " + contadorCifras + " cifras");
		
		// Cerramos el scanner
		reader.close();
	

	}

}

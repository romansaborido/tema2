package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que nos introduzca el usuario
		int numero = 0;
		
		// Creamos la variable multiplo10 para almacenar el multiplo de 10 de i
		int multiplo10;
		
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
			
		
		// Imprimimos numeros de 10 en 10 hasta el numero * 10
		for (int i = 1 ; i <= numero * 10 ; i*= 10) {
			
			// Multiplicamos la i * 10 para determinar el rango
			multiplo10 = i * 10 - 1;
			
			// Incrementamos la variable contadorCifras
			contadorCifras++;
			
			// Si el numero es mayor o igual que i y menor o igual que multiplo10
			if (numero > i - 1 && numero <= multiplo10) {
				System.out.println("Número de cifras: " + contadorCifras);
			}
		}
	
		
		// Cerramos el scanner
		reader.close();
	

	}

}

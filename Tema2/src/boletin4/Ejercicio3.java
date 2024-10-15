package boletin4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable suma para almacenar la suma de los numeros introducidos por el usuario
		int suma = 0;
		
		// Creamos la variable contador para contar todos los numeros que ha introducido el usuario
		int contador = 0;
		
		// Creamos la variable media para almacenar la media de los numeros
		double media;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario
		System.out.println("Introduzca un número entero positivo");
		numero = reader.nextInt();
		
		// Creamos el while: mientras que el numero no sea negativo el bucle se sigue ejecutando
		while (numero >= 0) {
			
			suma += numero;
			++contador;
			
			System.out.println("Introduzca un número entero positivo");
			numero = reader.nextInt();
		}
		
		// Definimos la variable media 
		media = suma / contador;
		
		// Mostramos el resultado
		System.out.println("La media de los números introducidos es: " + media);
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

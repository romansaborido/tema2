package boletin4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable suma para almacenar la suma de los numeros
		int suma = 0;
		
		// Creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero entero 
		System.out.println("Introduzca un número entero positivo");
		numero = reader.nextInt();
		
		// Creamos el bucle: mientras que el numero sea positivo se sigue ejecutando
		while (numero >= 0) {
			
			suma += numero;
			
			System.out.println("Introduzca un número entero positivo");
			numero = reader.nextInt();
			
		}

		// Mostramos el resultado de la suma de los números
		System.out.println("La suma de los números que has introducido es: " + suma);
		
		// Cerramos el scanner
		reader.close();
		

	}

}

package boletin6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable numero donde almacenaremos el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable suma donde almacenaremos el valor de la suma total de los numeros que introduzca el usuario
		int suma = 0;
		
		// Creamos la variable media donde almacenaremos el valor de la suma total de los numeros entre el numero total de numeros
		double media;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Mostramos al usuario el funcionamiento del programa
		System.out.print("¡Introduzca 10 números y te calculo la media de ellos! ");
		
		// Mientras que i sea menor o igual a 10 incrementamos su valor
		for (int i = 1 ; i <= 10 ; i++) {
			
			// Pedimos al usuario que introduzca el número
			System.out.println("Número " + i + ":");
			numero = reader.nextInt();
			
			// Calculamos la suma de los numeros
			suma += numero;
		}
		
		// Calculamos la media de los numeros introducidos por el usuario
		media = suma / 10;
		
		// Mostramos al usuario el resultado
		System.out.println("La media de los números introducidos es: " + media);
		
		// Cerramos el scanner
		reader.close();
		
			
		}

	}



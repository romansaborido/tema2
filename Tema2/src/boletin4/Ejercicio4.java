package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable numero donde almacenaremos el numero que introducira el usuario
		int numero = 0;
		
		// Creamos la variable contador para almacenar el numero de numeros que ha introducido el usuario
		int contador = 0;
		
		// Creamos la variable contadorCeros para almacenar el numero de ceros que ha introducido el usuario
		int contadorCeros = 0;
		
		// Creamos la variable suma donde almacenaremos la suma de los numeros positivos
		int suma = 0;
		
		// Creamos la variable media donde almacenaremos la media de los numeros negativos
		int media = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero 
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		// Creamos el bucle: mientras que recuento sea menor que 10 el bucle se sigue ejecutando
		while (contador < 10) {
			
			if (numero == 0) {
				++contadorCeros;
			} else if (numero > 0) {
				++contador;
				suma += numero;
			} else {
				++contador;
				media = suma / contador;
			} 
			
			System.out.println("Introduzca un número");
			numero = reader.nextInt();
		}
		

		// Mostramos el resultado final al usuario
		System.out.println("Suma de los números positivos: " + suma);
		System.out.println("Media de los números negativos: " + media);
		System.out.println("Número de ceros introducidos: " + contador);
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

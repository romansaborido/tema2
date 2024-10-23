package boletin6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable numero donde almacenaremos el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable factorial donde almacenaremos el resultado
		long factorial = 1;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario
		System.out.print("Introduzca un número para realizar su factorial: ");
		numero = reader.nextInt();
		
		// Mostramos al usuario el numero que ha introducido ya denotado como factorial
		System.out.print("!" + numero + " = ");
		
		// Mientras que i sea mayor o igual a 1 decrementamos el valor de i
		for (int i = numero ; i >= 2 ; i--) {
			
			// Calculamos el factorial
			factorial *= i;
			
			// Mostramos la operacion
			System.out.print(i + " x ");
		}
		
		// Mostramos el resultado final 
		System.out.println("1 = " + factorial);
		
		// Cerramos el scanner
		reader.close();
		

	}

}

package boletinbucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable a para almacenar el numero a que introducira el usuario
		int a;
		
		// Creamos la variable b para almacenar el numero b que introducira el usuario
		int b;
		
		// Creamos la variable maxComunDivisor donde almacenaremos dicho numero
		int maxComunDivisor = 1;
		
		// Creamos la variable numero1 donde almacenaremos el valor de a o el de b segun el resultado de la condicion
		int numero1 = 0;
		
		// Creamos la variable numero2 donde almacenaremos el valor de a o el de b segun el resultado de la condicion
		int numero2 = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el numero a y el b. Mientras que introduzca numeros iguales, numeros negativos o 0 se le seguira preguntando
		do {
		
			System.out.println("Introduzca el valor de a");
			a = reader.nextInt();
			
			System.out.println("Introduzca el valor de b");
			b = reader.nextInt();
		
		} while (a == b || a <= 0 || b <= 0);
	
		// Comparamos los valores y almacenamos valor en las variables numero1 y numero2
		if (a > b) {
			numero1 = a;
			numero2 = b;
		} else {
			numero1 = b;
			numero2 = a;
		}
		
		// Mientras que i sea mayor o igual que 1 decrementamos su valor
		for (int i = numero1 ; i >= 1 ; i--) {
			
			// Vamos comprobando si i es divisible por los dos numeros
			if (numero1 % i == 0 && numero2 % i == 0) {
				
				// Si maxComunDivisor es mayor que i actualizamos la variable a i
				if (maxComunDivisor < i) {
					maxComunDivisor = i;
				}
				
			}
			
		}
		
		// Mostramos el resultado
		System.out.println(maxComunDivisor + " es el máximo común divisor");
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

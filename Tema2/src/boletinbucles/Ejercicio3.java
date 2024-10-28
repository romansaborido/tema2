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
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el numero a
		System.out.println("Introduzca el valor de a");
		a = reader.nextInt();
		
		// Pedimos al usuario el numero b
		System.out.println("Introduzca el valor de b");
		b = reader.nextInt();
	
		// Si a es mayor que b
		if (a > b) {
			numero = a;
		}
		
		for (int i = numero ; i >= 1 ; i--) {
			
			if (numero % i == 0 && b % i == 0) {
				
				if (maxComunDivisor < i) {
					maxComunDivisor = i;
				}
				
			}
			
		}
		
		System.out.println(maxComunDivisor + " es el máximo común divisor");
		
		

	}

}

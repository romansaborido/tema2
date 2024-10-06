package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable a para almacenar el número entero que introduzca el usuario 
		int a;
				
		// Creamos la variable b para almacenar el número entero que introduzca el usuario 
		int b;
		
		// Creamos la variable c para almacenar el número entero que introduzca el usuario 
		int c;
				
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
				
		// Pedimos al usuario que introduzca el valor de a 
		System.out.println("Introduzca el valor de a");
		a = reader.nextInt();
				
		// Pedimos al usuario que introduzca el valor de b
		System.out.println("Introduzca el valor de b");
		b = reader.nextInt();
				
		// Pedimos al usuario que introduzca el valor de c
		System.out.println("Introduzca el valor de c");
		c = reader.nextInt();
		
		// Creamos la condición:

		if (a > c && a > b && b > c) {
			System.out.println("Ordenamos de mayor a menor:");
			System.out.println("1. " + a);
			System.out.println("2. " + b);
			System.out.println("3. " + c);	
		} else if (a > c && a > b && c > b) {
			System.out.println("Ordenamos de mayor a menor:");
			System.out.println("1. " + a);
			System.out.println("2. " + c);
			System.out.println("3. " + b);	
		}
		
		if (b > a && b > c && c > a) {
			System.out.println("Ordenamos de mayor a menor:");
			System.out.println("1. " + b);
			System.out.println("2. " + c);
			System.out.println("3. " + a);	
		} else if (b > a && b > c && a > c) {
			System.out.println("Ordenamos de mayor a menor:");
			System.out.println("1. " + b);
			System.out.println("2. " + a);
			System.out.println("3. " + c);	
		}
		
		if (c > a && c > b && a > b) {
			System.out.println("Ordenamos de mayor a menor:");
			System.out.println("1. " + c);
			System.out.println("2. " + a);
			System.out.println("3. " + b);	
		} else if (c > a && c > b && b > a) {
			System.out.println("Ordenamos de mayor a menor:");
			System.out.println("1. " + c);
			System.out.println("2. " + b);
			System.out.println("3. " + a);	
		}	
		
				// Cerramos el scanner
				reader.close();
				
				
			}
		}
package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la variable a donde almacenaremos el número que introduzca el usuario 
		double a;
		
		// Creamos la variable b donde almacenaremos el número que introduzca el usuario 
		double b;
				
		// Creamos la variable c donde almacenaremos el número que introduzca el usuario 
		double c;
		
		// Creamos la variable discriminante donde calcularemos el resultado del discriminante 
		double discriminante;
		
		/* Creamos la variable ecuacion donde calcularemos el resultado de la ecuacion de segundo grado a partir de los valores 
		introducidos por el usuario */
		double ecuacion;
		
		// Creamos el scanner 
		Scanner reader = new Scanner (System.in);
		
		// Pedimos al usuario que introduzca el valor de la variable a
		System.out.println("Introduzca el valor de a");
		a = reader.nextDouble();
		
		// Pedimos al usuario que introduzca el valor de b
		System.out.println("Introduzca el valor de b");
		b = reader.nextDouble();
		
		// Pedimos al usuario que introduzca el valor de c
		System.out.println("Introduzca el valor de c");
		c = reader.nextDouble();
		
		// Calculamos el resultado del discriminante 
		 
		// Calculamos el resultado de la ecuacion 
		ecuacion = -b +- Math.sqrt(b*b) - 4 * a * c / 2 * a;
		
		

	}

}

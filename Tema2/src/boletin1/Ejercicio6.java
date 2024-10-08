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
		
		// Creamos las variables para las soluciones
		double x1;
		double x2;
		
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
		
		// si a == 0
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("La ecuación sólo tiene una solución: " + x1);
		} else {
			discriminante = b * b - 4 * a * c;

				if (discriminante < 0) {
					System.out.println("La ecuación no tiene solución");
				} else {
					// (-5 + 3) /4 = -2 / 4
					x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
					// (-5 -3/ 4 = -2
					x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
					System.out.println("Primera solución: x1 = " + x1);
					System.out.println("Segunda solución: x2 = " + x2);
					}
				}

		// Cerramos el scanner		
		reader.close();
	}

}
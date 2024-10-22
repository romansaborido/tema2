package boletin5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la variable numero1 para almacenar el primer número que introduzca el usuario
		int numero1;
				
		// Creamos la variable numero2 para almacenar el segundo número que introduzca el usuario
		int numero2;
				
		// Creamos la variable menu para almacenar la opcion que escoja el usuario
		String menu;
				
		// Creamos las variables para las operaciones
		double suma;
		double resta;
		double multiplicacion;
		double division;
				
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
				
		// Mostramos al usuario el menú
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("E. SALIR");
		
		// Creamos el bucle para el menú
		do {
			// Pedimos al usuario que introduzca el número1
			System.out.println("Introduzca un número entero");
			numero1 = reader.nextInt();
					
			// Pedimos al usuario que introduzca el número2
			System.out.println("Introduzca un número entero");
			numero2 = reader.nextInt();
			
			// Establecemos las operaciones
			suma = numero1 + numero2;
			resta = numero1 - numero2;
			multiplicacion = numero1 * numero2;
			division = (double)numero1 / (double)numero2;
			
			// Pedimos al usuario que elija una opción
			System.out.println("Elija una opción");
			menu = reader.next();
					
			// switch (menu) {
			switch (menu) {
				case "A":
					System.out.println(numero1 + " + " + numero2 + " = " + suma);
					break;
				case "B":
					System.out.println(numero1 + " - " + numero2 + " = " + resta);
					break;
				case "C":
					System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
					break;
				case "D":
					System.out.println(numero1 + " / " + numero2 + " = " + division);
					break;
				case "E":
					System.out.println("Has salido del menú");
					break;
				default:
					System.out.println("Elija un opción válida: A/B/C/D/E (mayúsculas)");
					}
		
		// Mientras que la variable menu no sea "E", el bucle se seguira ejecutando
		} while (!menu.equals("E"));
				
		// Cerramos el scanner
		reader.close();
				
				
	}

}

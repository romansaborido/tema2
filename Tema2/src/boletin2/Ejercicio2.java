package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos una variable para almacenar el número que introduzca el usuario
		int numero;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca un número del 1 al 7
		System.out.println("Introduzca un número del 1 al 7 (1 y 7 inclusive)");
		numero = reader.nextInt();
		
		// switch (numero) {
		switch (numero) {
			case 1:
				System.out.println(numero + "--> LUNES");
				break;
			case 2: 
				System.out.println(numero + "--> MARTES");
				break;
			case 3:
				System.out.println(numero + "--> MIÉRCOLES");
				break;
			case 4:
				System.out.println(numero + "--> JUEVES");
				break;
			case 5:
				System.out.println(numero + "--> VIERNES");
				break;
			case 6:
				System.out.println(numero + "--> SÁBADO");
				break;
			case 7: 
				System.out.println(numero + "--> DOMINGO");
		}
		
		// Cerramos el scanner
		reader.close();
		
	
	}
}

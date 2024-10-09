package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable tirada1 para almacenar el resultado de la primera tirada
		String tirada1;
		
		// Creamos la variable tirada2 para almacenar el resultado de la segunda tirada
		String tirada2;
		
		// Creamos la variable para almacenar el resultado de la primera tirada en formato numérico
		int tirada1Num;
		
		// Creamos la variable para almacenar el resultado de la segunda tirada en formato numérico
		int tirada2Num;
		
		// Creamos la variable suma 
		int suma;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Preguntamos al usuario cuánto ha sacado en la primera tirada
		System.out.println("¿Cuánto has sacado en la primera tirada?");
		tirada1 = reader.nextLine();
		
		// Preguntamos al usuario cuánto ha sacado en la segunda tirada
		System.out.println("¿Cuánto has sacado en la segunda tirada?");
		tirada2 = reader.next();
		
		// switch (tirada1) {
		tirada1Num = switch (tirada1) {
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			default -> {
				System.out.println("Introduzca una puntuación válida (Formato alfabético, mayúsculas)");
				yield 0;
			}
		};
		
		// switch (tirada2) {
		tirada2Num = switch (tirada2) {
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			default -> {
				System.out.println("Introduzca una puntuación válida (Formato alfabético, mayúsculas)");
				yield 0;
			}
		};
		
		// Definimos la variable suma
		suma = tirada1Num + tirada2Num;
		
		// Mostramos la suma de las dos tiradas en formato numérico
		System.out.println("Puntuación total: " + tirada1Num + " + " + tirada2Num + " = " + suma);
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

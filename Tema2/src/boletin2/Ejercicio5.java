package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable permiso para almacenar la respuesta del usuario
		String permiso;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Preguntamos al usuario 
		System.out.println("¿Qué permiso de carnet de conducir dispones?");
		permiso = reader.next();
		
		// switch (permiso) {
		switch (permiso) {
			case "E":
				System.out.println("Remolques");
				break;
			case "D":
				System.out.println("Autobuses");
				break;
			case "C1","C2","C3","C4","C5":
				System.out.println("Camiones");
				break;
			case "A":
				System.out.println("Motocicletas");
				break;
			case "B1","B2":
				System.out.println("Automóviles");
				break;
			default:
				System.out.println("Categoría no contemplada");
				System.out.println("Introduzca el permiso con letra mayúscula");
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}
}

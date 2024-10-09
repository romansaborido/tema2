package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable tipo int para almacenar la nota 
		int nota;
		
		// Creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la nota 
		System.out.println("Introduzca tu nota sin decimales");
		nota = reader.nextInt();
		
		// switch (nota) {
		switch (nota) {
			case 0,1,2,3,4:
				System.out.println("INSUFICIENTE");
				break;
			case 5:
				System.out.println("SUFICIENTE");
				break;
			case 6:
				System.out.println("BIEN");
				break;
			case 7,8:
				System.out.println("NOTABLE");
				break;
			case 9,10:
				System.out.println("SOBRESALIENTE");
				break;
		}

		// Cerramos el scanner
		reader.close();
		

	}

}

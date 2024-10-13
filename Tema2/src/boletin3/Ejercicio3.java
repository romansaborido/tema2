package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable dni donde almacenaremos el dni sin letra del usuario
		int dni;
		
		// Creamos la variable dniConLetra donde almacenaremos el dni con letra
		int numeroLetra;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca su dni sin letra y lo almacenamos
		System.out.println("Introduzca su DNI sin letra");
		dni = reader.nextInt();
		
		// Calculamos el numero que corresponde a la letra del dni
		numeroLetra = dni % 23;
		
		
		// Comprobamos que el dni que ha introducido el usuario es válido y asignamos su letra correspondiente
		if (dni >= 10000000 && dni <= 99999999) {
		
			// switch (numeroLetra) {
			switch (numeroLetra) {
				case 0:
					System.out.println("Tu DNI con letra es " + dni +"T");
					break;
				case 1:
					System.out.println("Tu DNI con letra es " + dni +"R");
					break;
				case 2:
					System.out.println("Tu DNI con letra es " + dni +"W");
					break;
				case 3:
					System.out.println("Tu DNI con letra es " + dni +"A");
					break;
				case 4:
					System.out.println("Tu DNI con letra es " + dni +"G");
					break;
				case 5:
					System.out.println("Tu DNI con letra es " + dni +"M");
					break;
				case 6:
					System.out.println("Tu DNI con letra es " + dni +"Y");
					break;
				case 7:
					System.out.println("Tu DNI con letra es " + dni +"F");
					break;
				case 8:
					System.out.println("Tu DNI con letra es " + dni +"P");
					break;
				case 9:
					System.out.println("Tu DNI con letra es " + dni +"D");
					break;
				case 10:
					System.out.println("Tu DNI con letra es " + dni +"X");
					break;
				case 11:
					System.out.println("Tu DNI con letra es " + dni +"B");
					break;
				case 12:
					System.out.println("Tu DNI con letra es " + dni +"N");
					break;
				case 13:
					System.out.println("Tu DNI con letra es " + dni +"J");
					break;
				case 14:
					System.out.println("Tu DNI con letra es " + dni +"Z");
					break;
				case 15:
					System.out.println("Tu DNI con letra es " + dni +"S");
					break;
				case 16:
					System.out.println("Tu DNI con letra es " + dni +"Q");
					break;
				case 17:
					System.out.println("Tu DNI con letra es " + dni +"V");
					break;
				case 18:
					System.out.println("Tu DNI con letra es " + dni +"H");
					break;
				case 19:
					System.out.println("Tu DNI con letra es " + dni +"L");
					break;
				case 20:
					System.out.println("Tu DNI con letra es " + dni +"C");
					break;
				case 21:
					System.out.println("Tu DNI con letra es " + dni +"K");
					break;
				case 22:
					System.out.println("Tu DNI con letra es " + dni +"E");
					break;
			}
		
		} else {
			System.out.println("Introduzca un DNI válido");
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

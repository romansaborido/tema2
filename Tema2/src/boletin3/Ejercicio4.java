package boletin3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable numero donde almacenaremos el numero que introducira el usuario
		int numero;
		
		// Creamos una variable para almacenar la decena del numero
		int decena;
		
		// Creamos una variable para almacenar la unidad del numero
		int unidad;
		
		// Creamos una variable para almacenar la decena en formato alfabetico
		String decenaLetras;
		
		// Creamos una variable para almacenar la unidad en formato alfabetico
		String unidadLetras;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero y lo almacenamos
		System.out.println("Introduzca un número entre el 0 y el 99");
		numero = reader.nextInt();
		
		// Sacamos la decena del numero y la unidad
		decena = (int)numero / 10;
		unidad = numero % 10;
		
		// Comprobamos si el numero que ha introducido el usuario es valido y procedemos a pasarlo a formato alfabetico
		if (numero >= 0 && numero <= 99) {
			
			// Comprobamos si el numero tiene una cifra o dos 
			if (numero >= 0 && numero <= 9) {
				
				// switch (numero) {
				switch (numero) {
					case 0:
						System.out.println("Cero");
						break;
					case 1:
						System.out.println("Uno");
						break;
					case 2:
						System.out.println("Dos");
						break;
					case 3:
						System.out.println("Tres");
						break;
					case 4:
						System.out.println("Cuatro");
						break;
					case 5:
						System.out.println("Cinco");
						break;
					case 6:
						System.out.println("Seis");
						break;
					case 7:
						System.out.println("Siete");
						break;
					case 8:
						System.out.println("Ocho");
						break;
					case 9:
						System.out.println("Nueve");
						break;
				}
				
			// Comprobamos si el numero esta entre el 11 y el 19 inclusives
			} else if (numero >= 11 && numero <= 19) {
					
					// switch (numero) {
					switch (numero) {
						case 11:
							System.out.println("Once");
							break;
						case 12:
							System.out.println("Doce");
							break;
						case 13:
							System.out.println("Trece");
							break;
						case 14:
							System.out.println("Catorce");
							break;
						case 15:
							System.out.println("Quince");
							break;
						case 16:
							System.out.println("Dieciseis");
							break;
						case 17:
							System.out.println("Diecisiete");
							break;
						case 18:
							System.out.println("Dieciocho");
							break;
						case 19:
							System.out.println("Diecinueve");
							break;
					}
					
				// Del número 19 en adelante aplicar esta serie de funciones
				} else {
				
					// Almacenamos el valor alfabetico de la decena
					decenaLetras = switch (decena) {
						case 1 -> {
							yield "Diez";
						}
						case 2 -> {
							yield "Veinte";
						}
						case 3 -> {
							yield "Treinta";
						}
						case 4 -> {
							yield "Cuarenta";
						}
						case 5 -> {
							yield "Cincuenta";
						}
						case 6 -> {
							yield "Sesenta";
						}
						case 7 -> {
							yield "Setenta";
						}
						case 8 -> {
							yield "Ochenta";
						}
						case 9 -> {
							yield "Noventa";
						}
						default -> {
							yield "";
						}
					};
				
					// Almacenamos el valor alfabetico de la unidad
					unidadLetras = switch (unidad) {
						case 1 -> {
							yield "uno";
						}
						case 2 -> {
							yield "dos";
						}
						case 3 -> {
							yield "tres";
						}
						case 4 -> {
							yield "cuatro";
						}
						case 5 -> {
							yield "cinco";
						}
						case 6 -> {
							yield "seis";
						}
						case 7 -> {
							yield "siete";
						}
						case 8 -> {
							yield "ocho";
						}
						case 9 -> {
							yield "nueve";
						}
						default -> {
							yield "";
						}
					};
					
					// Imprimimos el resultado
					if (numero % 10 != 0) {
						System.out.println(decenaLetras + " y " + unidadLetras);
					} else {
						System.out.println(decenaLetras);
					}
				
				}
			
		// Si no se ha introducido un numero entre el 0 y el 99 se le indica al usuario
		} else {
			System.out.println("Introduzca un número válido");
			System.out.println("Número del 0 al 99 (0 y 99 inclusive)");
		}
	
		// Cerramos el scanner
		reader.close();
		
		
	}
}

	

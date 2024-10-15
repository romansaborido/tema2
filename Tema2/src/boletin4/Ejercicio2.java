package boletin4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero entero que introduzca el usuario
		int numero;
		
		// Creamos la variable recuento para almacenar el numero de numeros que ha introducido el usuario
		int recuento = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero entero al usuario
		System.out.println("Introduzca un numero entero positivo");
		numero = reader.nextInt();
		
		// Creamos el while: mientras que el numero no sea negativo se sigue ejecutando 
		while (numero >= 0) {
			
			recuento++;
			
			System.out.println("Introduzca un numero entero positivo");
			numero = reader.nextInt();
		}
		
		// Mostramos el numero de numeros que ha introducido el usuario
		System.out.println("Has introducido " + recuento + " numeros" );
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Creamos la variable numero1 donde almacenaremos el número que introducirá el usuario
		int numero1;
		
		// Creamos la variable numero2 donde almacenaremos el número que introducirá el usuario
		int numero2;
		
		// Creamos la variable numero3 donde almacenaremos el número que introducirá el usuario
		int numero3;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el primer número
		System.out.println("Introduzca un número");
		numero1 = reader.nextInt();
		
		// Pedimos al usuario que introduzca el segundo número
		System.out.println("Introduzca un número");
		numero2 = reader.nextInt();
				
		// Pedimos al usuario que introduzca el tercer número
		System.out.println("Introduzca un número");
		numero3 = reader.nextInt();
		
		// Si la suma de numero1 y numero2 da como resultado numero3 --> "La suma del primer y segundo número da como resultado el último numero introducido" : "La suma del primer y segundo número no da como resultado el último numero introducido"
		if (numero1 + numero2 == numero3) {
			System.out.println("La suma del primer y segundo número da como resultado el último numero introducido");
		} else {
			System.out.println("La suma del primer y segundo número no da como resultado el último numero introducido");
		}
		
		// Cerramos el scanner
		reader.close();

		
	}

}

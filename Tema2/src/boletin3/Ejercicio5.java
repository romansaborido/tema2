package boletin3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable numeroAleatorio1 para almacenar el primer numero aleatorio
		int numeroAleatorio1 = (int) (Math.random() * 99) + 1;
		
		// Creamos la variable numeroAleatorio2 para almacenar el segundo numero aleatorio
		int numeroAleatorio2 = (int) (Math.random() * 99) + 1;
		
		// Creamos la variable respuesta para almacenar el numero como resultado que introduzca el usuario
		int respuesta;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Preguntamos al usuario cual seria el resultado de la suma de los dos numeros
		System.out.println("¿Cuánto es " + numeroAleatorio1 + " + " + numeroAleatorio2 + "? Introduzca tu respuesta:");
		respuesta = reader.nextInt();
		
		// Comprobamos si el resultado es correcto o no 
		if (respuesta == numeroAleatorio1 + numeroAleatorio2) {
			System.out.println("Respuesta correcta");
		} else {
			System.out.println("Respuesta incorrecta");
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

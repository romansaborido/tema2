package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la clase random para seguidamente declarar la variable random
		Random rand = new Random();
	
		// Creamos la variable min para establecer el minimo 
		int min = 1;
				
		// Creamos la variable max para establecer el maximo
		int max = 101;
		
		// Creamos la variable numeroRandom donde almacenaremos el numero que genere el ordenador
		int numeroRandom;
		
		// Creamos la variable respuesta donde almacenaremos la respuesta del usuario
		String respuesta;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		do {
			// El ordenador genera el numero
			numeroRandom = rand.nextInt(min,max);
			
			// Intento del ordenador
			System.out.println("Tu número es " + numeroRandom + "?");
			respuesta = reader.nextLine();
			
			// Evaluamos la respuesta y actualizamos el rango
			if (respuesta.equalsIgnoreCase("mayor")) {
				min = numeroRandom + 1;
			}
			if (respuesta.equalsIgnoreCase("menor")) {
				max = numeroRandom;
			}
			
		// Mientras que la respuesta no sea igual, el bucle se seguira ejecutando
		} while (!respuesta.equalsIgnoreCase("igual"));
		
		// Mostramos el resultado
		System.out.println("He ganado!");
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

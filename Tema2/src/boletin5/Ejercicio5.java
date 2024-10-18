package boletin5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable numero donde almacenaremos el numero que introduzca el usuario para jugar
		int numero;
		
		// Creamos la variable numeroRandom donde almacenaremos el numero random que va a generar el ordenador
		int numeroRandom = (int) (Math.random() * 99) + 1;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero
		System.out.println("Introduzca un número del 1 al 100");
		numero = reader.nextInt();
		
		// Creamos el bucle 
		do {
			if (numero == numeroRandom) {
				System.out.println("He ganado");
			} else if (numeroRandom < numero) {
				System.out.println("Tu número es menor que el mío");
			} else {
				System.out.println("Tu número es mayor que el mío");
			}
		} while (numeroRandom != numero);

	}

}

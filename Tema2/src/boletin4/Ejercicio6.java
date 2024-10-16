package boletin4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la variable altura donde almacenaremos la altura del arbol que se introducira por teclado
		int altura = 0;
		
		// Creamos la variable alturaMaxima donde iremos almacenando la altura mas grande 
		int alturaMaxima = altura;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la altura
		System.out.println("Introduzca la altura en centímetros");
		altura = reader.nextInt();
		
		// Creamos el bucle: si el numero es -1 el bucle finaliza
		while (altura != -1) {
			
			// Si la altura es mayor que la alturaMaxima, actualizamos la variable alturaMaxima
			if (altura > alturaMaxima)
				alturaMaxima = altura;
			
			System.out.println("Introduzca la altura en centímetros");
			altura = reader.nextInt();
		}
		
		// Imprimimos la altura maxima
		System.out.println(altura == -1 ? "Introduzca una altura válida" : "La altura máxima es " + alturaMaxima);
		
		// Corregir
		
	}

}

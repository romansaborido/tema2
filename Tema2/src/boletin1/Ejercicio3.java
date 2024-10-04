package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable del número decimal que vamos a pedir al usuario
		double decimal;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el número decimal
		System.out.println("Introduzca un número con decimales");
		decimal = reader.nextDouble();
		
		/* Creamos la condición:
		if: el número no tiene decimales imprime por consola "El número que has introducido no tiene decimales"
		else if: número es igual a 0 imprime por consola "Tu número no es considerado casi cero" 
		else if: número es menor que uno y mayor que 0 o si el número es menor que 0 y mayor que -1 imprime por consola "Tu número es considerado casi-cero" ç
		else: "Tu número no es considerado casi-cero"
		*/
		if (decimal % 1 == 0) {
			System.out.println("El número que has introducido no tiene decimales");
		} else if (decimal == 0) {
			System.out.println("Tu número no es considerado casi-cero");
		} else if ((decimal < 1 && decimal > 0) || (decimal < 0 && decimal > -1)) {
			System.out.println("Tu número es considerado casi-cero");
		} else {
			System.out.println("Tu número no es considerado casi-cero");
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

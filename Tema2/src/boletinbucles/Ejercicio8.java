package boletinbucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que va introduciendo el usuario
		int numero;
		
		// Creamos la variable numeroAnterior para almacenar el numero anterior que ha introducido el usuario
		int numeroAnterior;
		
		// Creamos la variable contadorNumeros para almacenar el numero de numeros que ha introducido el usuario
		// Establecemos a 0 este contador porque contamos la entrada fuera del bucle menos el 0 para salir del bucle
		int contadorNumeros = 0;
		
		// Creamos la variable contadorFallos para almacenar el numero de fallos que ha cometido el usuario
		int contadorFallos = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario
		System.out.print("Dime un número: ");
		numero = reader.nextInt();
		
		
		// Repetimos el bloque de instrucciones mientras que numero no sea 0
		do {
			
			// Asignamos el valor de numero a numeroAnterior
			numeroAnterior = numero;
			
			// Pedimos el numero al usuario
			System.out.print("Dime un número: ");
			numero = reader.nextInt();
			
			// Incrementamos la variable contadorNumeros
			contadorNumeros++;
			
			// Si numero es menor que numeroAnterior se le muestra el siguiente mensaje por pantalla al usuario e incrementamos la variable numeroFallos
			if (numero < numeroAnterior && numero != 0) {
				System.out.println("Fallo es menor.");
				contadorFallos++;
			}
			
		} while (numero != 0);
		
		
		// Mostramos el total de numeros introducidos y el total de fallos
		System.out.println("Total de números introducidos: " + contadorNumeros);
		System.out.println("Números fallados: " + contadorFallos);
		
		// Cerramos el scanner
		reader.close();
	}

}

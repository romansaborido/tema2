package boletinbucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que le pediremos al usuario
		int numero;
		
		// Creamos la variable contador
		int contador = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Si el numero es menor o igual que 0 se le seguira preguntando
		do {
			// Pedimos el numero al usuario
			System.out.println("Introduzca un número");
			numero = reader.nextInt();
			
			// Controlamos la entrada del numero
			assert (numero > 0) : "El número debe ser mayor que 0";
		} while (numero <= 0);
		
		
		for (int i = numero ; i <= 1 ; numero--)
			
		
		
		
		
		
		
		
		
			
		
		
		
		

	}

}

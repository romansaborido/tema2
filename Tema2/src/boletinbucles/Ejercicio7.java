package boletinbucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que le pediremos al usuario
		int numero;
		
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
		
		// Incrementamos el valor de i mientras que sea menor o igual a numero. Contamos de 1 al numero
		for (int i = 1 ; i <= numero ; i++) {
			
			// Incrementamos el valor de j mientras que sea menor o igual a i. Contamos hasta i
			for (int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}
			
			// Decrementamos el valor de k mientras que sea mayor o igual a 1. Contamos desde i - 1 hasta el 1
			for (int k = i - 1 ; k >= 1 ; k--) {
				System.out.print(k);
			}
			
			// Añadimos al final de la iteracion de los anteriores for un salto de linea
			System.out.println();
		}
		
		// Cerramos el scanner
		reader.close();
			
		
	}

}

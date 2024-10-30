package boletinbucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos la variable numero para almacenar el numero que nos introduzca el usuario
		int numero;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario. Mientras que el numero sea menor o igual que 0 se le seguira preguntando
		do {
			System.out.println("Introduzca un número. Te diré cuantas cifras tiene");
			numero = reader.nextInt();
		} while (numero <= 0);
		
		// Mirar en casa

}

}

package boletinbucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la variable n para almacenar el numero que introduzca el usuario
		int n;
		
		// Creamos la variable contador para almacenaer el numero de veces que queremos imprimir el asterisco en la misma linea
		int contadorAsteriscos;
		
		int contadorEspacios;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el valor de n al usuario
		System.out.println("Introduzca un número mayor o igual que 2. Crearé un triángulo a partir de dicho número");
		n = reader.nextInt();
		
		for (int j = n ; j >= n ; j--) {
			
			contadorEspacios = 0;
			
			do {
				System.out.print(" ");
				contadorEspacios++;
				
				for (int i = 2 ; i <= n ; i++) {
					
					contadorAsteriscos = 0;
					
					do {
						System.out.print("*");
						contadorAsteriscos++;
					} while (contadorAsteriscos < i - 1);
					
					System.out.println("*");
				}
				
			} while (contadorEspacios < j);
			
		}
		
		
		
		

	}

}

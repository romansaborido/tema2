package boletinbucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la variable n para almacenar el numero que introduzca el usuario
		int n;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el valor de n al usuario
		System.out.println("Introduzca un número mayor o igual que 2. Crearé un triángulo a partir de dicho número");
		n = reader.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			
			for (int j = 1 ; j <= n-i ; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1 ; k <= i ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
		// Cerramos el scanner
		reader.close();
		
		
	}

}

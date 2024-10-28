package boletinbucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable a para almacenar el numero a que introducira el usuario
		int a;

		// Creamos la variable b para almacenar el numero b que introducira el usuario
		int b;
		
		// Creamos la variable multiplo donde almacenaremos los posibles comunes multiplos
		int multiplo;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario el numero a y el b. Mientras que introduzca numeros iguales, numeros negativos o 0 se le seguira preguntando
		do {

			System.out.println("Introduzca el valor de a");
			a = reader.nextInt();

			System.out.println("Introduzca el valor de b");
			b = reader.nextInt();

		} while (a == b && a <= 0 && b <= 0);

		// Inicializamos multiplo al mayor de los dos numeros
		multiplo = (a > b) ? a : b; 
        
        // Incrementamos multiplo hasta que sea divisible por ambos
        while (multiplo % a != 0 || multiplo % b != 0) {
            multiplo++;
        }
        
        // Mostramos el resultado
        System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + multiplo);
        
        // Cerramos el scanner
        reader.close();
        
        
    }
	
}
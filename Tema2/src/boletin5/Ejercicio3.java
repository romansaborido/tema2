package boletin5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la variable n donde almacenaremos el numero que introduzca el usuario por teclado 
		int n;
		
		// Creamos la variable numero que establecemos a 1
		int numero = 0;
		
		// Creamos la variable suma donde almacenaremos la suma de los numeros
		int suma = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el valor de n
		System.out.println("Introduzca el valor de 'n'");
		n = reader.nextInt();
		
		// Creamos el bucle: realizamos el bloque de instrucciones mientras que el numero sea menor que n 
		do {
			// Incrementamos el valor de numero
			++numero;
			
			// Calculamos la suma de los numeros 
			suma += numero;
			
			// Si el numero no es n imprime: numero +. Si el numero es n imprime numero = suma
			if (numero != n) {
			System.out.print(numero + "+");
			} else {
				System.out.println(numero + " = " + suma);
			}
			
		// Mientras que el numero sea menor que 200, el bucle se seguira ejecutando	
		} while (numero < n);
		
		// Cerramos el scanner
		reader.close();

		
	}

}

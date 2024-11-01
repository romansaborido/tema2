package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable contadorPar para almacenar el numero de cifras pares que tiene el numero
		int contadorPar = 0;
		
		// Creamos la variable contadorImpar para almacenar el numero de cifras impares que tiene el numero
		int contadorImpar = 0;
		
		// Creamos la variable ultimaCifra para ir evaluando la ultima cifra del numero
		int ultimaCifra;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario
		System.out.println("Introduzca un número. Te diré cuantas cifras pares e impares tiene");
		numero = reader.nextInt();
		
		// Mientras que el numero sea mayor que 0
		while (numero > 0) {
			
			// Obtenemos la ultima cifra del numero
			ultimaCifra = numero % 10;
			
			// Si el numero es par incrementamos contadorPar sino contadorImpar
			if (ultimaCifra % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
			
			// Eliminamos la ultima cifra del numero
			numero /= 10;
		}
		
		// Mostramos el resultado
		System.out.println("El número que has escrito tiene " + contadorPar + " cifras pares y " + contadorImpar + " cifras impares");
		
		// Cerramos el scanner
		reader.close();
		

	}

}

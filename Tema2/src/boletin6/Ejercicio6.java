package boletin6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la variable nota donde almacenaremos la nota de los alumnos que introduzca el usuario
		int nota;
		
		// Creamos la variable suspenso donde almacenaremos el numero de suspensos
		int suspenso = 0;
		
		// Creamos la variable contador para simplemente anotar el numero de nota que esta introduciendo el usuario
		int contador = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Mostramos el funcionamiento del programa al usuario
		System.out.println("¡Introduzca 5 notas y te diré cuantos suspensos hay! ");
		
		// Mientras que i sea mayor o igual que 1 decrementamos su valor
		for (int i = 5 ; i >= 1 ; i--) {
			
			// Incrementamos la variable contador
			contador++;
			
			// Pedimos al usuario que introduzca una nota
			System.out.println("Nota " + contador + ": " );
			nota = reader.nextInt();
			
			// Si la nota es menor que 5 incrementamos el valor de suspenso
			if (nota < 5) {
				suspenso++;
			}	
		}
		
		// Mostramos el resultado
		System.out.println("Hay " + suspenso + " suspensos");
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

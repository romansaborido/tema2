package boletinbucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable horas para almacenar las horas que introduzca el usuario
		int horas;
		
		// Creamos la variable minutos para almacenar los minutos que introduzca el usuario
		int minutos;
		
		// Creamos la variable segundos para almacenar los segundos que introduzca el usuario
		int segundos;
		
		// Creamos la variable segundosIncrementar para almacenar los segundos a incrementar que introduzca el usuario
		int segundosIncrementar;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Pedimos al usuario el numero de horas, mientras que introduzca una cantidad no valida se le seguira preguntando
		do {
			System.out.println("Introduzca un número de horas");
			horas = reader.nextInt();
			
			// Si la cantidad de horas que ha introducido el usuario no es correcta se le muestra el siguiente mensaje
			if (horas < 0 || horas > 59)
				System.out.println("El número de segundos es incorrecto");
			
		} while (horas < 0 || horas > 23);
		
		
		// Pedimos al usuario el numero de minutos, mientras que introduzca una cantidad no valida se le seguira preguntando
		do {
			System.out.println("Introduzca un número de minutos");
			minutos = reader.nextInt();
			
			// Si la cantidad de minutos que ha introducido el usuario no es correcta se le muestra el siguiente mensaje
			if (minutos < 0 || minutos > 59)
				System.out.println("El número de minutos es incorrecto");
			
		} while (minutos < 0 || horas > 59);
		
		
		// Pedimos al usuario el numero de segundos, mientras que introduzca una cantidad no valida se le seguira preguntando
		do {
			System.out.println("Introduzca un número de segundos");
			segundos = reader.nextInt();
			
			// Si la cantidad de segundos que ha introducido el usuario no es correcta se le muestra el siguiente mensaje
			if (segundos < 0 || segundos > 59)
				System.out.println("El número de segundos es incorrecto");
		
		} while (segundos < 0 || segundos > 59);
		
		
		// Pedimos al usuario el numero de segundos a incrementar, mientras que introduzca una cantidad inferior a 0
		do {
			System.out.println("Introduzca un número de segundos a incrementar");
			segundosIncrementar = reader.nextInt();
					
			// Si la cantidad de segundos a incrementar es menor que 0 se le muestra el siguiente mensaje
			if (segundosIncrementar < 0)
				System.out.println("El número de segundos es incorrecto");
				
		} while (segundosIncrementar < 0);
		
		

		// Si la i es menor o igual a segundosIncrementar, incrementamos segundos
		for (int i = 1 ; i <= segundosIncrementar ; i++) {
			
			// Incrementamos los segundos
			segundos++;
			
			// Si segundos == 60
			if (segundos == 60) {
				minutos++;
				// Si minutos == 60
				if (minutos == 60) {
					horas++;
				}
			}
		}
		
		// Mostramos el resultado final
		if (segundos == 60 && minutos != 60) {
			System.out.println(horas + ":" + minutos + ":00");
		} else if (segundos == 60 && minutos == 60) {
			System.out.println(horas + ":" + "00:00");
		} else {
			System.out.println(horas + ":" + minutos + ":" + segundos);
		}
		
			

		
		
	
		
		// Cerramos el scanner
		reader.close();

		
	}

}

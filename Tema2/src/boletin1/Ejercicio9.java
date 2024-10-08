package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Creamos las constantes piedra, papel, tijera
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		
		// Creamos las variables para almacenar las elecciones de los jugadores
		String jugador1;
		String jugador2;
		
		// Creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		// Turno del jugador 1
		System.out.println("Jugador 1 --> Elija PIEDRA, PAPEL o TIJERAS");
		jugador1 = reader.nextLine();
		
		// Turno del jugador 2
		System.out.println("Jugador 2 --> Elija PIEDRA, PAPEL o TIJERAS");
		jugador2 = reader.nextLine();
		
		// Si introducen la misma cadena quedan empate, sino tiene que valorar el desempate
		if (jugador1.equalsIgnoreCase(jugador2)) {
			System.out.println("EMPATE");
		} else if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("GANADOR --> JUGADOR 1");
		} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERAS)) {
			System.out.println("GANADOR --> JUGADOR 1");
		} else if (jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("GANADOR --> JUGADOR 1");
		} else {
			System.out.println("GANADOR --> JUGADOR 2");
		}
		
		// Cerramos el scanner
		reader.close();

	}

}

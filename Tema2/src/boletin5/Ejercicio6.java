package boletin5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos las constantes piedra, papel, tijera
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		
		// Creamos la variable jugada1 para almacenar la jugada del jugador 1
		String jugada1;
		
		// Creamos la variable jugada2 para almacenar la jugada del jugador 2
		String jugada2;
		
		// Creamos la variable reiniciar para almacenar el caracter que hara que empiece otra partida
		char reiniciar = 'S';
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		do {
			// Turno del jugador 1
			System.out.println("Turno del jugador 1");
			jugada1 = reader.nextLine();
			
			// Turno del jugador 2
			System.out.println("Turno del jugador 2");
			jugada2 = reader.nextLine();
			
			// Si introducen la misma cadena quedan empate, sino tenemos que valorar el desempate
			if (jugada1.equalsIgnoreCase(jugada2)) {
				System.out.println("EMPATE");
			} else if (jugada1.equalsIgnoreCase(PAPEL) && jugada2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("GANADOR --> JUGADOR 1");
			} else if (jugada1.equalsIgnoreCase(PIEDRA) && jugada2.equalsIgnoreCase(TIJERAS)) {
				System.out.println("GANADOR --> JUGADOR 1");
			} else if (jugada1.equalsIgnoreCase(TIJERAS) && jugada2.equalsIgnoreCase(PAPEL)) {
				System.out.println("GANADOR --> JUGADOR 1");
			} else {
				System.out.println("GANADOR --> JUGADOR 2");
			}
		
		// Mientras que reiniciar sea S, o el jugador 1 o el 2 no introduzcan un valor valido
		} while ((reiniciar == 'S') || (!jugada1.equalsIgnoreCase(PIEDRA)) || (!jugada1.equalsIgnoreCase(PAPEL)) || (!jugada1.equalsIgnoreCase(TIJERAS)) || (!jugada2.equalsIgnoreCase(PIEDRA)) || (!jugada2.equalsIgnoreCase(PAPEL)) || (!jugada2.equalsIgnoreCase(TIJERAS)));
	
		
	}
}



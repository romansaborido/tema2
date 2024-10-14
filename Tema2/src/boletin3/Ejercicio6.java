package boletin3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de incrementar un segundo

		// Creamos una variable para almacenar las horas que introduzca el usuario
		int horas;
		
		// Creamos una variable para almacenar los minutos que introduzca el usuario
		int minutos;
		
		// Creamos una variable para almacenar los segundos que introduzca el usuario
		int segundos;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que nos introduzca el numero de horas
		System.out.println("Introduzca el numero de horas (0-23)");
		horas = reader.nextInt();
		
		// Pedimos al usuario que nos introduzca el numero de minutos
		System.out.println("Introduzca el numero de minutos (0-59)");
		minutos = reader.nextInt();
				
		// Pedimos al usuario que nos introduzca el numero de segundos
		System.out.println("Introduzca el numero de segundos (0-59)");
		segundos = reader.nextInt();
		
		// Validamos la entrada
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Hora, minutos o segundos no válidos. Por favor, verifica tu entrada");
        } else {
            // Incrementamos los segundos
            segundos++;
            
            // Ajuste de los desbordamientos
            if (segundos == 60) {
                segundos = 00;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 00;
                horas++;
            }
            if (horas == 24) {
                horas = 00;
            }
            
            // Mostrar la nueva hora
            System.out.println("La hora después de incrementar un segundo es: " + horas + ":" + minutos + ":" + segundos);
        }
        
        // Cerramos el scanner
        reader.close();
        
        
    }
}
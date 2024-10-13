package boletin3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la variable numeroDias para almacenar el numero de dias de estancia del usuario
		int numeroDias;
		
		// Creamos la variable distancia para almacenar el numero de km que va a realizar el usuario
		int distancia;
		
		// Creamos la constante PRECIO_KM para almacenar constantemente el precio del kilometro establecido
		final double PRECIO_KM = 2.5;
		
		// Creamos la variable descuento para calcular el descuento a aplicar
		double descuento;
		
		// Creamos la variable precioInicial para almacenar el precio inicial del billete sin el descuento aplicado
		double precioInicial;
		
		// Creamos la variable precioFinal para almacenar el precio final del billete con el descuento ya aplicado
		double precioFinal;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero de dias 
		System.out.println("Introduzca el número de días de estancia");
		numeroDias = reader.nextInt();
		
		// Pedimos al usuario que introduzca el numero de kilometros
		System.out.println("Introduzca el número de kilómetros de distancia");
		distancia = reader.nextInt();
		
		// Calculamos el precio inicial de la entrada
		precioInicial = distancia * PRECIO_KM;
		
		// Calculamos el descuento
		descuento = precioInicial * 30 / 100;
		
		// Comprobamos si tenemos que aplicar el descuento o no
		if (numeroDias >= 7 && distancia >= 800) {
			precioFinal = precioInicial - descuento;
		} else {
			precioFinal = precioInicial;
		}
		
		// Imprimimos el resultado
		System.out.println("El coste del billete es de: " + precioFinal + " €");
		
		// Cerramos el scanner
		reader.close();
		
	
	}

}

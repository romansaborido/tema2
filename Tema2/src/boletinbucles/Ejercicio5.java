package boletinbucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la variable N para almacenar el numero que introduzca el usuario
		int N;
		
		// Creamos la variable contador para almacenar el numero de veces que queremos imprimir el numero en la misma linea
		int contador;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el valor de N, mientras que introduzca un valor menor o igual que 0, o mayor que 20 se le seguira preguntando
		do {
			System.out.println("Introduzca el valor de N. Tiene que ser un número entre el 1 y el 20");
			N = reader.nextInt();
		} while (N <= 0 || N > 20);

		// Imprimimos 1 con salto de linea
		System.out.println("1");
		
		// Mientras que i sea menor o igual que N incrementamos el valor de i
		for (int i = 2 ; i <= N ; i++) {
			
			// Establecemos el contador a 0 dentro del bucle para que se reinicie en cada iteracion
			contador = 0;
			
			// Imprimimos i (sin salto de linea) mientras que el contador sea menor que i - 1
			do {
				System.out.print(i);
				contador++;
			} while (contador < i - 1);
			
			// Imprimimos i (con salto de linea)
			System.out.println(i);
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}

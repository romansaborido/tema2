package boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos una variable para almacenar la nota que introducirá el alumno teniendo en cuenta que la nota es un número entero
		int nota;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la nota mediante un syso
		System.out.println("Introduzca su nota");
		nota = reader.nextInt();
		
		// Si la nota está comprendida entre el 0 y el 10 que compruebe la calificación del alumno, sino que muestre un aviso al usuario por consola
		if (nota >= 0 && nota <= 10) {
		} if (nota >= 0 && nota < 5) {
				System.out.println(nota + " --> INSUFICIENTE");
			} else if (nota >= 5 && nota < 6) {
				System.out.println(nota + " --> SUFICIENTE");
			} else if (nota >= 6 && nota < 7) {
				System.out.println(nota + " --> BIEN");
			} else if (nota >= 7 && nota < 9) {
				System.out.println(nota + " --> NOTABLE");
			} else if (nota >= 9 && nota <= 10) {
				System.out.println(nota + " --> SOBRESALIENTE");
			} else { 
				System.out.println("Introduzca un número del 0 al 10 (0 y 10 inclusive)"); 
			} 
	
		// Cerramos el scanner
		reader.close();
		
	}

}

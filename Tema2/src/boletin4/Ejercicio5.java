package boletin4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/* Creamos la variable edad para recoger las distintas edades de los alumnos que el usuario nos va
		a proporcionar */
		int edad;
		
		// Creamos la variable suma donde almacenaremos la suma de todas las edades recogidas 
		int suma = 0;
		
		// Creamos la variable media donde almacenaremos la edad media de los alumnos 
		int media = 0;
		
		// Creamos la variable recuento para obtener el numero de alumnos 
		int recuento = 0;
		
		// Crearemos la variable recuentoMayoresEdad para obtener el numero de alumnos que son mayores de edad
		int recuentoMayoresEdad = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos la edad al usuario
		System.out.println("Introduzca la edad del alumno");
		edad = reader.nextInt();
		
		// Creamos el bucle: si el numero introducido es menor o igual a 0, el bucle finaliza 
		while (edad > 0) {
			
			recuento++;
			suma += edad;
			media = suma / recuento;
			
			if (edad >= 18) {
				recuentoMayoresEdad++;
			}
			
			System.out.println("Introduzca la edad del alumno");
			edad = reader.nextInt();
		}
		
		// Mostramos al usuario los resultados
		System.out.println("Suma de las edades introducidas: " + suma);
		System.out.println("Edad media del alumnado: " + media);
		System.out.println("Número de alumnos: " + recuento);
		System.out.println("Número de alumnos mayores de edad: " + recuentoMayoresEdad);
		
		// Cerramos el scanner
		reader.close();
		

	}

}

package boletin3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos la variable mes para almacenar el mes que introduzca el usuario
		int mes;
		
		// Creamos la variable año para almacenar el año que introduzca el usuario
		int año;
		
		// Creamos la variable dias para almacenar los dias que tiene el mes
		int dias;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el numero del mes
        System.out.println("Introduzca el número del mes (1-12)"); 
        mes = reader.nextInt();

        // Pedimos al usuario el año
        System.out.println("Introduzca el año");
        año = reader.nextInt();
        
        // Validamos el mes
        if (mes < 1 || mes > 12) {
            System.out.println("Mes no válido. Debe estar entre 1 y 12");
        } else {
            // Comprobamos si el año es bisiesto
            boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
            
            // Determinamos el número de días
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    break;
                case 2:
                	// Si es febrero, comprobamos si es bisiesto o no
                    if (bisiesto) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                default:
                    dias = 0;
                    break;
            }
            
            // Imprimimos el resultado
            System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días");
        }
        
        // Cerramos el scanner
        reader.close();
        
        
    }
	
}
package boletin5;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la variable numero y la establecemos a 0
		int numero = 0;
		
		// Creamos el bucle: incrementamos la variable numero y la volvemos a incrementar si el numero es menor que 20
		do {
			// Incrementamos la variable numero
			numero++;
			
			// Si el numero no es 20, imprimimos el numero y la coma detrás, si es 20 solo el numero
			if (numero != 20) {
			System.out.print(numero + ",");
			} else {
				System.out.println(numero);
			}
			
		// Mientras que el numero sea menor que 20, el bucle se seguira ejecutando 
		} while (numero < 20);

		
	}

}

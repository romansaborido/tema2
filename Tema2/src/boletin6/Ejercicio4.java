package boletin6;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la variable suma donde almacenaremos la suma de los 10 primeros numeros impares
		int suma = 0;
		
		// Mostramos al usuario el funcionamiento del programa
		System.out.println("¡Bienvenido al programa que te muestra la suma de los 10 primeros números impares!");
		
		// Mientras que i sea menor o igual que 19 incrementamos i de 2 en 2
		for (int i = 1 ; i <= 19 ; i += 2) {
			
			// Calculamos la suma de los numeros
			suma += i;
			
			// Mostramos el resultado
			System.out.print(i + " + ");
			
			// Si i es 19
			if (i == 19)
				System.out.println(i + " = " + suma);
		}
		
		
	}

}

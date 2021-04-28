
/**
 * Factorial.java
 * Programa que pide un número entero positivo, calcula su factorial y lo muestra en la consola.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {

		// Método Scanner para solicitar datos en la consola
		Scanner teclado = new Scanner(System.in);

		int numero;
		int numeroFactorial = 1;

		System.out.println("Introduce un número positivo:"); // Solicitamos un número
		numero = teclado.nextInt(); // Guardamos el número

		if(numero < 0) { // Si es negativo
			
			System.out.println("Número no válido, tiene que ser positivo o 0");
			
		}
		
		// Bucle para determinar el factorial del número introducido
		while(numero != 0) {
			numeroFactorial = numeroFactorial * numero;
			numero--;
		}

		System.out.println("El número factorial es " + numeroFactorial);

	}

}

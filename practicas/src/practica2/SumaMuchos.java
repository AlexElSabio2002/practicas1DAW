/**
 * SumaMuchos.java
 * Programa que pide números hasta que se introduce el número 0 y la su en la consola del sistema.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class SumaMuchos {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos en la consola
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		int numeroIntroducido, resultado = 0;
		
		System.out.println("Si quieres finalizar el programa introduce el número 0\n"); // Informamos como fnalizar el programa
		
		do {
			
			System.out.println("Introduce un número entero positivo:"); // Solicitamos un número
			numeroIntroducido = teclado.nextInt(); // Guardamos el número
			
			if(numeroIntroducido < 0) {
				
				System.out.println("Número no válido, introduce otro número positivo");
				
			} else if(numeroIntroducido == 0) { // Si numeroIntroducido es igual a 0
				
				contador = 1; // Contador es igual a 1 y finaliza el bucle
				
			} else {
				
				resultado += numeroIntroducido; // Acumulamos la suma de los números
				
			}

			
		} while(contador == 0); // Mientras que contador sea igual a 0
		
		System.out.println("\nLa suma de todos los números introducidos es " + resultado);
		
	}

}

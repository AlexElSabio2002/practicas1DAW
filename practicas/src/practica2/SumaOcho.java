/**
 * SumaOcho.java
 * Programa que pide ocho números enteros, los suma y los muestra en la consola del sistema.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class SumaOcho {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos en la consola
		Scanner teclado = new Scanner(System.in);
		
		int numero, resultado = 0; // Variables numéricas
		
		for(int i = 1; i <= 8; i++) { // Si i es menor o igual que 8 se si sigue ejecutando el bucle
			
			System.out.println("Introduce el número " + i + ":"); // Solicitamos número
			numero = teclado.nextInt(); // Guardamos el valor introducido
			resultado += numero; // Acumulamos el valor de la suma
			
		}
		
		System.out.println("\nEl resultado de la suma es: " + resultado);
		
	}

}

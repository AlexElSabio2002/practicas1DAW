/**
 * NumerosEnteros.java
 * Programa que pide tres números enters y los muestra en la consola del sistema.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class NumerosEnteros {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos por teclado
		Scanner teclado = new Scanner(System.in);
		
		//Solicitamos númeors enteros
		int numero1; // Varaible numérica
		System.out.println("Introduce el primer número: "); // Mensaje en pantalla
		numero1 = teclado.nextInt(); // Guardamos dato por teclado
		
		int numero2;
		System.out.println("Introduce el segundo número: ");
		numero2 = teclado.nextInt();
		
		int numero3;
		System.out.println("Introduce el tercer número: ");
		numero3 = teclado.nextInt();
		
		// Imprimimos los números en pantalla
		System.out.println("\nNumero 1: " + numero1 + "\nNúmero 2: " + numero2 + "\nNúmero 3: " + numero3);
		
	}
}

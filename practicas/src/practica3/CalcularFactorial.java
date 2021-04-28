// Factorial.java
// Fecha: 02/12/2020
// Autor: Alejandro Garay López
// Calcula el factorial del número introducido.

import java.util.Scanner;

public class CalcularFactorial {
	public static void main(String args[]) {
		
		factorial(preguntarNumero());

	}

	static int preguntarNumero() { // Preguntamos el número del que vamos a sacar su tabla de multiplicar

		// Declaramos variables
		Scanner tecladoNumero = new Scanner(System.in);
		int numero; // Guardamos el número para sacar su tabla

		System.out.println("Introduce un número");
		numero = tecladoNumero.nextInt();

		return numero;

	}

	static void factorial(int numero) { // Calcula y muestra el facotiral de el número introducido

		int numeroFactorial = 0;
		int multiplicador = numero;

		for (int i = 1; i <= numero; i++) { // Bucle para calcular el factorial del número introducido

			multiplicador--;
			numeroFactorial += (numero * multiplicador);
			

		}
		
		System.out.println("El facotrial de " + numero + " es " + numeroFactorial);

		

	}

}
/**
 * EcuacionSegundoGrado.java
 * Programa que pide tres números, hace una ecuación de segundo grado y lo muestra en la consola.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class EcuacionSegundoGrado {
	public static void main(String args[]) {

		// Método Scanner para solicitar datos en la consola
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c; 
		double x0, x1; 

		System.out.println("Introduce el valor a:");
		a = teclado.nextDouble();
		System.out.println("Introduce el valor b:");
		b = teclado.nextDouble();
		System.out.println("Introduce el valor c:");
		c = teclado.nextDouble();

		double numero = (b * b) - (4 * a * c);

		if (numero > 0) { // Si numero es positivo

			//Continuamos con la ecuación
			x0 = (-b + Math.sqrt(numero)) / (2 * a);
			x1 = (-b - Math.sqrt(numero)) / (2 * a);
			
			System.out.println("\nLa ecuacion tiene dos soluciones");
			System.out.println("X0: " + x0); // Solucion 1
			System.out.println("X1: " + x1); // Solucion 2

		} else{ // Si es negativo

			if (numero == 0) { // Si es igual a 0

				x0 = (-b) / (2 * a);
				
				System.out.println("\nLa ecuacion tiene una solucion");
				System.out.println("X0 :" + x0); // Única solución

			} else{ // Si no es igual a 0
				
				System.out.println("\nLa ecuacion no tien solución"); // No hay solución
				
			}
		}

	}

}

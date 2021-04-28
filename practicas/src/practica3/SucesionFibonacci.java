// SucesionFibonacci.java
// Fecha: 02/12/2020
// Autor: Alejandro Garay López
// Calcula los salarios semanales de empleados.

import java.util.Scanner;

public class SucesionFibonacci {
	public static void main(String args[]) {
		
		fibonacci(validarNumero(preguntarNumero()));

	}

	static int preguntarNumero() { // Preguntamos el número del que vamos a sacar su tabla de multiplicar

		// Declaramos variables
		Scanner tecladoNumero = new Scanner(System.in);
		int numero; // Guardamos el número para sacar su tabla

		System.out.println("Introduce un número");
		numero = tecladoNumero.nextInt();

		return numero;

	}

	static int validarNumero(int numero) { // Validamos el número introducido
		
		// Declaramos variables
		Scanner tecladoNumero = new Scanner(System.in);
		int controlador = 0; // Controlador del bucle
		int numeroValidado = 0; // Guardamos el numero validado
		
		// Bucle para validad número
		do {
			
			if(numero < 0) { // Si numero es negativo
				
				System.out.println("ERROR, introduce un número positivo:"); // Mostramos error
				numero = tecladoNumero.nextInt(); // Guardamos un nuevo número
				
				
			} else { // Si numero es positivo
				
				controlador = 1; // Salimos del bucle
				numeroValidado = numero; // Guardamos el número ya validado
				
			}
			
		} while (controlador == 0); // Mientras que controlador sea 0
		
		return numeroValidado; // Retornamos el número ya validado
		
	}

	static void fibonacci(int numeroValidado) { 
		
		if(numeroValidado == 0) {
			
			System.out.println("El valor correspondiente en la sucesión fibonacci es 0");
			
		} else if(numeroValidado == 1) {
			
			System.out.println("El valor correspondiente en la sucesión fibonacci es 1");
			
		} else {
			
			int posicion0 = 0;
			int posicion1 = 1;
			int posicion2 = 0;
			
			for(int i = 1; i < numeroValidado; i++) {

				posicion2 = posicion1 + posicion0;
				posicion0 = posicion1;
				posicion1 = posicion2;
				
			}
			
			System.out.println("El valor correspondiente en la sucesión fibonacci es " + posicion2);
			
		}
				
	}

}
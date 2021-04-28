/**
 * Operaciones.java
 * Programa que pide dos números, te ofrece un menú para realizar distintas operacion y te muestra el resultado en la consola.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class Operaciones {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos en la consola
		Scanner tecladoNumerico = new Scanner(System.in);
		Scanner tecladoTexto = new Scanner(System.in);

		double resultado, numero1, numero2;
		int condicion = 0;
		int eleccion = 0;
		String finalizar;
		
		// Bucle para finalizar el programa o hacer operaciones con dos números
		do {
			
			// Informamos como finalizar el programa o hacer operaciones
			System.out.println("\nSi quieres salir del programa introduce la letra T, si quieres hacer una operación introduce cualquier otra tecla");
			finalizar = tecladoTexto.nextLine();
			
			if(finalizar.equalsIgnoreCase("T")) { // Si finalizar es igual a T
				
				condicion = 1;
				System.out.println("Programa finalizado");
				
			} else { // Si finalizar no es igual a T
				
				// Solicitamos los números
				System.out.println("\nIntroduce el primer número:");
				numero1 = tecladoNumerico.nextDouble();
				
				System.out.println("Introduce el segundo número:");
				numero2 = tecladoNumerico.nextDouble();
				
				// Ofrecemos 4 opciones con diferentes operaciones
				System.out.println("Selecciona una de estas 4 opciones introduciendo el número correspondiente:");
				System.out.println("**********************\n1-Sumar" + "\n2-Restar" + "\n3-Multiplicar" + "\n4-Dividir\n**********************");
				eleccion = tecladoNumerico.nextInt();
				
				if(eleccion == 1) { // Si es 1 suma
					
					resultado = numero1 + numero2;
					System.out.println("El resultado es: " + resultado);
					
				} else if(eleccion == 2) { // Si es 2 resta
					
					resultado = numero1 - numero2;
					System.out.println("El resultado es: " + resultado);
					
				} else if(eleccion == 3) { // Si es 3 multiplica
					
					resultado = numero1 * numero2;
					System.out.println("El resultado es: " + resultado);
					
				} else if(eleccion == 4) { // Si es 4 divide
					
					resultado = numero1 / numero2;
					System.out.println("El resultado es: " + resultado);
					
				} else { // Si no es ninguna opción ofrecida
					
					System.out.println("Has introducido un número no válido\n");
					
				}
				
			}
			
			
		} while(condicion == 0); // Si condición es 0
		
		
	}

}

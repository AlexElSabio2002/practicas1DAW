// ElementoFrecuente.java
// Fecha: 23/01/2021
// Autor: Alejandro Garay López
// Busca que número es más frecuente dentro de un vector

import java.util.Scanner;

public class ElementoFrecuente {
	public static void main(String args[]) {
		
		int[] array = asignarElementos(longitudArray());
		masFrecuenteInt(array);
		
		
	}

	
	static int[] longitudArray() { // Asignamos el tamaño del array

		Scanner tecladoArray = new Scanner(System.in);

		System.out.println("---------------------------------------");
		System.out.println("Introduce la longitud del array");
		int[] array = new int[tecladoArray.nextInt()];
		System.out.println("---------------------------------------");

		return array; // Retornamos el array con su tamaño
	}

	static int[] asignarElementos(int[] array) { // Asignamos los elementos al array

		Scanner tecladoArray = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el elemento " + i + ":");
			array[i] = tecladoArray.nextInt();

		}

		return array; // Retornamos el array completo
	}
	
	static void masFrecuenteInt(int[] array) { // Buscamos el número en el vector
		
		int numeroFrecuente = 0; // El número que más se repite
		int numerosEncontrados = 0; // Contador
		int numero; // El número que comprobamos cuantas veces se repite
		int confirmacionRepeticion = 0;
		
		//Sacamos uno a uno los elementos del array
		for(int i=0; i<array.length; i++) {
			numero = array[i]; // Comprobamos uno a uno si se repite algún numero
			numerosEncontrados = 0; // Contador
			
			// Sacamos uno a uno los elementos del array de nuevo para comprobar si se repite
			for(int elemento:array) {		
				if(numero == elemento) { // Si coincide algún elemento con el número que estamos comprobando
					numerosEncontrados++; // Aumenta el contador
					
				}
				
			}
			
			if(numerosEncontrados > numeroFrecuente && numerosEncontrados > 1) { // Si el contador es mayor que el anterior número más frecuente
				numeroFrecuente = numero; // Se asigna el valor del núnero más frecuente
				confirmacionRepeticion = 1; // Confirmamos que se repite algún número
				
			}
			
		}
		
		if(confirmacionRepeticion == 0) { // Si no se repite
			System.out.println("Ningún número se repite");
			
		} else { // Si se repite más de una vez
			System.out.println("El número más frecuente es el " + numeroFrecuente);
			
		}
		
	}
	
}

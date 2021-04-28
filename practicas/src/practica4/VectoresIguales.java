// VectorIguales.java
// Fecha: 23/01/2021
// Autor: Alejandro Garay López
// Comprueba si dos vectores son iguales

import java.util.Scanner;

public class VectoresIguales {
	public static void main(String[] args) {

		int[] primerArray = asignarElementos(longitudArray(1));
		int[] segundoArray = asignarElementos(longitudArray(2));
		
		vectoresIguales(primerArray, segundoArray);
		
		
	}

	static int[] longitudArray(int numeroArray) { // Asignamos el tamaño del array

		Scanner tecladoArray = new Scanner(System.in);

		System.out.println("---------------------------------------");
		System.out.println("Introduce la longitud array " + numeroArray + ":");
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

	static void vectoresIguales(int[] primerArray, int[] segundoArray) { // Comparamos los arrays
		
		int comparador1, comparador2; // Comparadores de elementos
		
		if(primerArray.length == segundoArray.length) { // Si el tamaño de los vectores coincide
			// Compara uno a uno los elementos de los dos vectores
			for(int i=0; i<primerArray.length;i++) { // Hasta que no queden elementos
				// Asignamos uno a uno los elementos a las variables
				comparador1 = primerArray[i]; 
				comparador2 = segundoArray[i];
				
				if(comparador1 != comparador2) { // Si no coinciden los elementos
					System.out.println(""
							+ "---------------------------------------\n"
							+ "Los valores de los vectores no coinciden");
					i = primerArray.length + 1; // Salimos del bucle
					
				} else if(comparador1 == comparador2 && i == primerArray.length - 1) { // Si todos los elementos coinciden
					
					System.out.println(""
							+ "---------------------------------------\n"
							+ "Los vectores tienen los mismos valores");
					
				}
				
			}
			
		} else { // Si el tamaño de los vectores no coincide
			System.out.println(""
					+ "---------------------------------------\n"
					+ "Los vectores tienen distinto tamaño");
			
		}
		
	}

}

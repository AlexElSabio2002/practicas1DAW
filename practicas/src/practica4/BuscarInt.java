// BuscarInt.java
// Fecha: 23/01/2021
// Autor: Alejandro Garay López
// Busca un enetero entre los elementos de un array

import java.util.Scanner;

public class BuscarInt {
	public static void main(String[] args) {
		
		int[] primerArray = asignarElementos(longitudArray());
		buscarInt(primerArray, numeroBuscado());

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
	
	static int numeroBuscado() { // Asignamos que número vamos a buscar
		
		int numero;
		
		Scanner tecladoNumero = new Scanner(System.in);
		
		System.out.println("Introduce que número quieres buscar");
		numero = tecladoNumero.nextInt();
		
		return numero; // Retornamos el número que vamos a buscar
	}
	
	static void buscarInt(int[] array, int numero) { // Buscamos el número en el vector
		
		int contador = 0;
		int numerosEncontrados = 0;
		
		// Sacamos uno a uno los elementos del vector
		for(int elemento:array) {
			if(elemento == numero) { // Si un elemento coincide con el número buscado
				System.out.println("-----");
				System.out.println(contador); // Devolvemos la posición del número dentro del vector
				numerosEncontrados++; // Sumamos uno al contador de numeros encontrados
				break;
				
			} else { // Si el elemento no coincide con el número que buscamos
				contador++;
				
			}
			
		}
		
		if(numerosEncontrados == 0) { // Si no ha encontrado el número que buscamos
			System.out.println("-----------------------------");
			System.out.println("No se ha encontrado el número");
			
		}
		
	}

}

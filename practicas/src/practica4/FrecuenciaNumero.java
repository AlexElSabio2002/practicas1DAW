// FrecuenciaNumero.java
// Fecha: 23/01/2021
// Autor: Alejandro Garay López
// Busca cuantas veces se repite en el vector el número que eligamos

import java.util.Scanner;

public class FrecuenciaNumero {
	public static void main(String[] args) {

		int[] primerArray = asignarElementos(longitudArray());
		frecuenciaNumero(primerArray, numeroBuscado());

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

	static void frecuenciaNumero(int[] array, int numero) { // Mostramos cuantas veces se repite el número elegido

		int numerosEncontrados = 0; // Contador

		// Sacamos uno a uno los elementos del array
		for (int elemento : array) {
			if (numero == elemento) { // Si el numero elegido coincide con algún elemento
				numerosEncontrados++; // Sumamos uno al contador de frecuencia

			}

		}

		if (numerosEncontrados == 0) { // Si no se encuentran números repetidos
			System.out.println("El número " + numero + " no se repite");

		} else { // Si se repite el número alguna vez
			System.out.println("El número " + numero + " se repite " + numerosEncontrados + " veces");

		}

	}

}

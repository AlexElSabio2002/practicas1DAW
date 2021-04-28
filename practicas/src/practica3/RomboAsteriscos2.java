// RomboAsteriscos2.java
// Fecha: 06/12/2020
// Autor: Alejandro Garay López
// Crea la forma de un rombo a través de un parámetro introducido.

import java.util.Scanner;

public class RomboAsteriscos2 {
	public static void main(String args[]) {

		rombo();

	}

	// Preguntamos el tamaño del rombo
	static int preguntarNumero() {

		// Declaramos variables
		Scanner tecladoNumero = new Scanner(System.in);
		int numero; // Guardamos el tamaño del rombo

		System.out.println("Introduce un número");
		numero = tecladoNumero.nextInt();

		return numero; // Retornamos el valor

	}

	// Validamos el número introducido
	static int validarNumero(int numero) { // Recibe el tamaño del rombo

		// Declaramos variables
		Scanner tecladoNumero = new Scanner(System.in);
		int controlador = 0; // Controlador del bucle
		int numeroValidado = 0; // Guardamos el numero validado

		// Bucle para validad número
		do {

			if ((numero % 2) == 0) { // Si numero es par

				System.out.println("ERROR, introduce un número negativo:"); // Mostramos error
				numero = tecladoNumero.nextInt(); // Guardamos un nuevo número

			} else { // Si numero es impar

				controlador = 1; // Salimos del bucle
				numeroValidado = numero; // Guardamos el número ya validado

			}

		} while (controlador == 0); // Mientras que controlador sea 0

		return numeroValidado; // Retornamos el número ya validado

	}

	// Generamos la mitad del rombo
	static String generarMitadAsteriscos1(int valorValidado) {

		String asteriscos = "*"; // Almacenamos los asteriscos

		/*
		 * Mientras que i sea menor que valorValidado se añadirán
		 * asteriscos a la variable asteriscos
		 */
		for (int i = 1; i < valorValidado; i++) {

			asteriscos += "**";

		}

		return asteriscos; // Retornamos el valor

	}

   // Generamos la mitad de espacios en blanco
	static String generarMitadBlancos1(int valorValidado) {

		String espaciosBlancos = ""; // Almacenamos los espacios en blanco

		/*
		 * Mientras que i sea menor que valorValidado se añadirán
		 * espacios en blanco a espaciosBlancos
		 */
		for (int i = 1; i <= valorValidado; i++) {

			espaciosBlancos += " ";

		}

		return espaciosBlancos; // Retornamos el valor

	}

	// Generamos la mitad del rombo
	static void generarMitadRombo1(int tamañoMitadRombo1) {

		int cantidadMitadBlancos1 = tamañoMitadRombo1; // Almacenamos en cantidadMitadBlancos1 el tamaño de la mitad del rombo

		/*
		 * Mientras que i sea menor o igual que el tamaño del tamañoMitadRombo1
		 * se imprimirán por pantalla los valores que retornen los métodos
		 */
		for (int i = 1; i < tamañoMitadRombo1; i++) {

			System.out.println(

					generarMitadBlancos1(cantidadMitadBlancos1) + // Pasamos la cantidad de blancos 
					generarMitadAsteriscos1(i) // Pasamos i para generar asteriscos

			);

			cantidadMitadBlancos1--; // Vamos restando la cantidad de blancos para que cada vez genere menos

		}

	}

	// Generamos la otra mitad del rombo
	static String generarMitadAsteriscos2(int valorValidado) {

		String asteriscos = "*"; // Almacenamos los asteriscos

		/*
		 * Mientras que i sea menor que valorValidado se añadirán
		 * asteriscos a la variable asteriscos
		 */
		for (int i = 1; i < valorValidado; i++) {

			asteriscos += "**";

		}

		return asteriscos; // Retornamos el valor

	}

	// Generamos la otra mitad de espacios en blanco
	static String generarMitadBlancos2(int cantidadBlancos) {

		String espaciosBlancos = "";

		/*
		 * Mientras que i sea menor que cantidadBlancos se añadirán
		 * espacios en blanco a espaciosBlancos
		 */
		for (int i = 0; i <= cantidadBlancos; i++) {

			espaciosBlancos += " ";

		}

		return espaciosBlancos; // Retornamos el valor

	}

	// Generamos la mitad
	static void generarMitadRombo2(int tamañoMitadRombo2) {

		int cantidadMitadAsteriscos2 = tamañoMitadRombo2; // Almacenamos en cantidadBlancos el tamaño del triangulo

		/*
		 * Mientras que i sea menor o igual que el tamaño del tamañoMitadRombo2
		 * se imprimirán por pantalla los valores que retornen los métodos
		 */
		for (int i = 1; i < tamañoMitadRombo2; i++) {

			System.out.println(

					generarMitadBlancos2(i) + // Pasamos la cantidad de blancos 
					generarMitadAsteriscos2(cantidadMitadAsteriscos2 - 1) // Pasamos i para generar asteriscos

			);

			cantidadMitadAsteriscos2--; // Vamos restando la cantidad de blancos para que cada vez genere menos

		}

	}

	// Generamos los asteriscos del medio del rombo
	static void mitadRombo(String asteriscos) {
		
		System.out.println(" " + asteriscos);
		
	}
	
	static void rombo() {
		
        int valorValidado = validarNumero(preguntarNumero());
		
		generarMitadRombo1(valorValidado);
		
		mitadRombo(generarMitadAsteriscos1(valorValidado)); 

		generarMitadRombo2(valorValidado);
		
	}
	
}
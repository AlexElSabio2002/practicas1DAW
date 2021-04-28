// TrianguloAsteriscos2.java
// Fecha: 06/12/2020
// Autor: Alejandro Garay López
// Crea la forma de un triángulo con asteriscos del tamaño que indique el usuario.

import java.util.Scanner;

public class TrianguloAsteriscos2 {
	public static void main(String args[]) {

		triangulo(solicitarTamaño());
			
	}

	// Solicita el tamaño del triángulo
	static int solicitarTamaño() {

		Scanner teclado = new Scanner(System.in); // Declaramos un Scanner

		// Solicitamos el tamaño del triángulo
		System.out.println("Introduce el tamaño del triángulo");
		int horasTriangulo = teclado.nextInt(); // Almacenamos el tamaño del triángulo

		return horasTriangulo; // Retornamos el valor

	}

	// Genera asteriscos
	static String generarAsteriscos(int tamañoTriangulo) { // Recibe el tamaño del triángulo
		
		String asteriscos = "*"; // Almacenamos los asteríscos de cada fila
		
		/*
		 * Mientras que i sea menor que tamañoTriangulo se añadirán
		 * asteriscos a la variable asteriscos
		 */
		for(int i = 1; i < tamañoTriangulo; i++) {
			
			asteriscos += "**"; // Almacenamos asteriscos
			
		}
		
		return asteriscos; // Retornamos el valor
		
	}
	
	// Genera espacios en blanco
	static String generarBlancos(int cantidadBlancos) { // Recibe la cantidad de espacios en blanco
		
		String espaciosBlancos =""; // Almacenamos los espacios en blanco de cada fila
		
		/*
		 * Mientras que i sea menor que cantidadBlancos se añadirán
		 * espacios a la variable espaciosBlancos
		 */
		for(int i = 0; i < cantidadBlancos; i++) {
			
			espaciosBlancos += " "; // Almacenamos espacios en blanco
			
		}
		
		return espaciosBlancos; // Retornamos el valor
		
	}

	// Genera el tríangulo de asteriscos
	static void triangulo(int tamañoTriangulo) {
		
		int cantidadBlancos = tamañoTriangulo; // Almacenamos en cantidadBlancos el tamaño del triangulo
		
		/*
		 * Mientras que tamañoTriangulo sea menor o igual que el tamaño
		 * del del triangulo se imprimirán por pantalla los valores que retornen
		 * los métodos
		 */
		for(int i = 1; i <= tamañoTriangulo; i++) {
			
			System.out.println(
					
					generarBlancos(cantidadBlancos) +
					generarAsteriscos(i)
					
					);
			
			cantidadBlancos--; // Vamos restando la cantidad de blancos para que cada vez genere menos
			
		}
		
	}
	
}
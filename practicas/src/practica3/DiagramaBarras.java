// DiagramaBarras.java
// Fecha: 06/12/2020
// Autor: Alejandro Garay López
// Genera un diagrama de barras mediante número introducidos por el usuario.

import java.util.Scanner;

public class DiagramaBarras {

	static String diagramaBarrasCompleto = ""; // Almacenará el diagrama de barras con el diseño
	static String cantidadAsteriscos = ""; // Almacenará el bloque de caracteres
	static String cantidadEspaciosBlancos = ""; // Almacenará los espacios en blanco
	static String diagramaBarras = ""; // Almacenará el diagrama de barras
	static final int LIMITE_SUPERIOR = 10;
	static final int LIMITE_INFERIOR = -10;
	static final char CARACTER_BASE = '*';

	public static void main(String args[]) {

		System.out.println("Introduce un número entre -10 y 10");

		// El bucle se va a ejecutar 9 veces
		for (int i = 1; i <= 9; i++) {

			generarBarraHorizontal(solicitarNumero());
		}

		// Muestra el diagrama de barra completo
		System.out.println(diagramaBarrasCompleto);

	}

	// Solicita un número entero
	static int solicitarNumero() {

		// Declaración variables
		Scanner tecladoNumero = new Scanner(System.in);
		int numero; // Almacena el número introducido

		numero = tecladoNumero.nextInt(); // Scanner

		return numero; // Retorna el valor

	}

	// Muestra el diagrama de barras
	static String generarBarraHorizontal(int numero) {

		diagramaBarras = generarBloqueCaracteres(numero, CARACTER_BASE); // Almacena los bloques de caracteres que se van generando
		mostrarDiagramaBarras(numero);

		return diagramaBarrasCompleto; // Retorna el valor

	}

	// Genera el diagrama de barras
	static String generarBloqueCaracteres(int numero, char CARACTER_BASE) { // Recibe el numero introducido y el carácter a utilizar

		cantidadAsteriscos = ""; // Resetea la cantidad de asteriscos
		cantidadEspaciosBlancos = ""; // Resetea los espacios en blanco

		// Comprueba si el número introducido está dentro o fuera del rango
		if(numero >= LIMITE_INFERIOR && numero <= LIMITE_SUPERIOR) { // Si está dentro del rango
			
			// Comprueba si el número es negativo, positivo o 0
			if (numero < 0) { // Si es negativo

				generarEspaciosBlancosNegativo(numero);
				generarAsteriscosNegativo(numero);

				cantidadAsteriscos = cantidadEspaciosBlancos + cantidadAsteriscos + "|"; // Almacena el bloque de caracteres completo

			} else if (numero > 0) { // Si es positivo

				generarEspaciosBlancosPositivo(numero);
				generarAsteriscosPositivo(numero);

				cantidadAsteriscos = cantidadEspaciosBlancos + "|" + cantidadAsteriscos; // Almacena el bloque de caracteres completo

			} else if (numero == 0) { // Si es 0

				cantidadAsteriscos = "          " + "|"; // Almacena el bloque de caracteres completo
			}
			
		} else { // Si está fuera del rango
			
			cantidadAsteriscos = "FUERA DE RANGO";
			
		}

		return cantidadAsteriscos; // Retornamos el valor
	}

	// Genera espacios en blanco
	static void generarEspaciosBlancosNegativo(int numero) { // Recibe el número introducido

		/* La condición para que se ejecute el bucle es que i sea
		 * menor o igual a la suma de 10 y el número introducido. Esta
		 * suma dá como resultado el número de espacios en blanco que
		 * faltan hasta llegar a 10
		 */
		for (int i = 1; i <= (10 + numero); i++) {

			cantidadEspaciosBlancos += " "; // Almacena los espacios en blanco
		}

	}

	// Genera asteriscos
	static void generarAsteriscosNegativo(int numero) { // Recibe el número introducido

		for (int i = numero; i < 0; i++) {

			cantidadAsteriscos += CARACTER_BASE; // Almacena los asteriscos

		}

	}

	// Genera espacios en blanco
	static void generarEspaciosBlancosPositivo(int numero) { // Recibe el número introducido

		for (int i = 1; i <= 10; i++) {

			cantidadEspaciosBlancos += " "; // Almacena los espacios en blanco

		}

	}

	// Genera asteriscos
	static void generarAsteriscosPositivo(int numero) { // Recibe el número introducido

		for (int i = 1; i <= numero; i++) {

			cantidadAsteriscos += CARACTER_BASE; // Almacena los asteriscos

		}

	}

	// Muestra el diagrama de barras
	static void mostrarDiagramaBarras(int numero) { // Recibe el número introducido

		String numeroValidadoString = Integer.toString(numero); // Parseo a String

		// Añade diseño al diagrama de barras en función de la longitud del número introducido
		if (numeroValidadoString.length() == 1) { // Si la longitud es 1

			numeroValidadoString = "  " + numeroValidadoString; // Añade espacios en blanco delante
			diagramaBarrasCompleto += numeroValidadoString + "\t" + diagramaBarras + "\n"; // Añade el diseño al bloque de caracteres

		} else if (numeroValidadoString.length() == 2) { // Si la longitud es 2

			numeroValidadoString = " " + numeroValidadoString; // Añade espacios en blanco delante
			diagramaBarrasCompleto += numeroValidadoString + "\t" + diagramaBarras + "\n"; // Añade el diseño al bloque de caracteres

		} else { // Cualquier otra longitud

			diagramaBarrasCompleto += numero + "\t" + diagramaBarras + "\n"; // Añade el diseño al bloque de caracteres

		}

	}

}
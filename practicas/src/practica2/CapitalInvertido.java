/**
 * CapitalInvertido.java
 * Programa que calcula el interés producido y el capital total acumulado de un capital inicial invertido a un tipo de interés anual
 * y lo muestra en la consola del sistema.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class CapitalInvertido {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos por teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el capital principal inicial:");
		int capitalInicial = teclado.nextInt(); // Guardamos el capital inicial
		
		System.out.println("Introduce el interés anual:");
		int interesAnual = teclado.nextInt(); // Guardamos el interés anual
		
		System.out.println("Introduce el número de años:");
		int numeroAños = teclado.nextInt(); // Guardamos el númeor de años
		
		// Calculamos el capital final con esta fórmula y lo imprimimos en pantalla
		double capitalFinal = capitalInicial * Math.pow((1 + interesAnual), numeroAños);
		System.out.println("Capital: " + capitalFinal);
		
	}
}

// Multiplo4.java
// Fecha: 02/12/2020
// Autor: Alejandro Garay López
// Escribe en pantalla los múltiplos de 2 por debajo de un tope que escriba el usuario.

import java.util.Scanner;

public class Multiplo4 {
	public static void main(String argumentos[]) {
		
		mostrarMultiplos2(pedirTope());
		
	}
	
	//Genera múltiplos de 2 hasta un tope que le pasa el método pedirTope()
	static void mostrarMultiplos2(int tope) {

		// Declaración de variables
		int mult = 0; // Almacena el múltiplo calculado
		int cont = 0; // Contador utilizado en el cálculo

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope) // Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont + 1) + '\t' + mult);
			++cont;
		}
		
	}
	
	public static int pedirTope() { // Pedimos un valor tope
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un tope");
		int tope = teclado.nextInt();
		
		return tope;
	
	}
	
}
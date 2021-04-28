/**
 * MayorDeTodos.java
 * Programa que pide números hasta que se pulsa la tecla S y muestra cuál es el mayor en la consola del sistema.
 * agl - 07.11.202
 */

import java.util.Scanner;

public class MayorDeTodos {
	public static void main(String args[]) {
		
		// Método Scanner para solicitar datos en la consola
		Scanner tecladoTexto = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		
		String condicion = "S", letra; // Variables de texto
		int numeroMayor = 0, numeroIntroducido; // Variable numérica
		
		// Bucle para introducir números y escoger el mayor
		do {
			
			System.out.println("Para continuar con el programa introduce la letra S"); // Indicamos como finalizar el programa
			letra = tecladoTexto.nextLine();
			
			if(letra.equalsIgnoreCase("S")) { // Si numeroIntroducido es igual a S
				
				System.out.println("Introduce un número:"); // Solicitamos número
				numeroIntroducido = tecladoNumerico.nextInt();
				
				if(numeroIntroducido >= numeroMayor) { // Si numeroIntroducido es mayor o igual a numeroMayor
					
					numeroMayor = numeroIntroducido; // Guardamos el número mayor
					System.out.println("\nEl mayor número de todos los introducidos es: " + numeroMayor + "\n");
					
				} else {
					
					System.out.println("\nEl mayor número de todos los introducidos sigue siendo: " + numeroMayor + "\n");
					
				}
				
			} else {
				
				condicion = "A";
				System.out.println("Programa finalizado");
				
			}
			
		} while(condicion == "S"); // Mientras que sea distinto de S
		
		
	}

}

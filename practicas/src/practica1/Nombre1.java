/*
 *Alejandro Garay López (1º DAW)
 * Programa que solicita nombres y edades de dos personas
 * y las imprime en pantalla de manera organizada
 */

import java.util.Scanner;

public class Nombre1 {
	public static void main(String[] args) {
		/* tecladoTexto y tecladoNumerico es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner tecladoTexto = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		
		//Declaramos variables
		String nombre1, nombre2;
		int edad1, edad2; 
		
		//Solicitamos los datos al usuario
		System.out.println("Escribe el nombre del primer usuario:");
		nombre1 = tecladoTexto.nextLine();
		System.out.println("Escribe la edad del primer usuario:");
		edad1 = tecladoNumerico.nextInt();
		System.out.println("Escribe el nombre del segundo usuario:");
		nombre2 = tecladoTexto.nextLine();
		System.out.println("Escribe la edad del segundo usuario:");
		edad2 = tecladoNumerico.nextInt();
		
		System.out.println("\n*Usuario 1*\n" + "Nombre: " + nombre1 + "\nEdad: " + edad1);
		System.out.println("\n*Usuario 2*\n" + "Nombre: " + nombre2 + "\nEdad: " + edad2);
	
	}

}

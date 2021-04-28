// TablasMultiplicar.java
// Fecha: 02/12/2020
// Autor: Alejandro Garay López
// Calcula la tabla de multiplicar hasta 15 productos del número introducido.

import java.util.Scanner;

public class TablasMultiplicar {
	public static void main(String args[]) {

		calcularMostrarTabla(preguntarNumero());
		
	}
	
	static int preguntarNumero() { // Preguntamos el número del que vamos a sacar su tabla de multiplicar
		
		//Declaramos variables
		Scanner tecladoNumero = new Scanner (System.in);
		int numero; // Guardamos el número para sacar su tabla
		
		System.out.println("Introduce un número");
		numero = tecladoNumero.nextInt();
		
		return numero;
		
	}
	
	static void calcularMostrarTabla(int numero) { // Calculamos y mostramos la tabla del número introducido
		
		System.out.println("\t" + "Tabla del " + numero + "\n");
		
		// Bucle para crear la tabla de multiplicar de el número introducido
		for(int i = 1; i <= 15; i++) {
			
			int tabla = (numero * i); // Guardamos las multiplicaciones
			System.out.println("\t" + numero + " x " + i + " = " + tabla); // Mostramos la tabla de forma visual
			
		}
		
	}


}
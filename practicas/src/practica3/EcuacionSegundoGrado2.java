// EcuacionSegundoGrado2.java
// Fecha: 06/12/2020
// Autor: Alejandro Garay López
// Calcula las soluciones de una ecuación de segundo grado.

import java.util.Scanner;

public class EcuacionSegundoGrado2 {
	
	public static void main(String args[]) {

		evaluarDiscriminante(preguntarCoeficiente(), preguntarCoeficiente(), preguntarCoeficiente());
			
	}
	
	// Preguntamos un coeficiente (a, b o c)
	static int preguntarCoeficiente() {
		
		// Declaramos variables
		Scanner tecladoTexto = new Scanner(System.in);
		int coeficiente;
		
		System.out.println("Introduce un coeficiente ");
		coeficiente= tecladoTexto.nextInt(); // Almacenamos el valor
		
		return coeficiente; // Retornamos el valor
	}

	// Evaluamos el discriminante y averiguamos la solución
	static void evaluarDiscriminante(int a, int b, int c) {
		
		int discriminante = (b * b) - 4 * a * c;
		
		if(a == 0 && b == 0) {
			
			System.out.println("La ecuación degenerada porque a y b valen 0");
			
		} else if(a == 0 && b != 0) {
			
			System.out.println("Existe solo una raíz debido a que es igual a 0 pero b no");
			
		} else if(discriminante >= 0) {
			
			System.out.println("La ecuación tiene dos raíces reales");
			
		} else if(discriminante < 0) {
			
			System.out.println("La ecuación tiene dos raíces complejas");
			
		}
		
	}
	
}
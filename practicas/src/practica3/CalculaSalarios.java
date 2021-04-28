// CalculaSalarios.java
// Fecha: 02/12/2020
// Autor: Alejandro Garay López
// Calcula los salarios semanales de empleados.

import java.util.Scanner;

public class CalculaSalarios {
	public static void main(String args[]) {

		String continuar = ""; // Inicializamos la variable
		
		// Bucle para ejecutar los métodos
		do {

			mostrarResultado(calcularSalario(solicitarHoras())); // Mostramos el resultado
			continuar = preguntaContinuar(); // Preguntamos si quiere finalzar el programa

		} while (!continuar.equalsIgnoreCase("E")); // Hasta que el usuario introduce una E

	}

	static int solicitarHoras() { // Solicita las horas de un trabajador

		Scanner teclado = new Scanner(System.in); // Declaramos un Scanner

		// Solicitamos las horas de un trabajador
		System.out.println("Introduce las horas del trabajador");
		int horasTrabajador = teclado.nextInt(); // Almacenamos las horas del trabajador

		return horasTrabajador; // Retornamos las horas del trabajador

	}

	static int calcularSalario(int horasTrabajador) { // Calcula el salario en función de las horas de cada trabajador

		int salarioTotal = 0; // Guarda el salarioTotal

		// Calculamos el salario total
		if (horasTrabajador <= 35) { // Si las horas trabajadaas son iguales o inferiores a 35

			salarioTotal = horasTrabajador * 15;

		} else { // Si las horas trabajadas son superiores a 35

			int salarioBase = horasTrabajador * 15; // Guarda el salario base
			int horasExtra = horasTrabajador - 35; // Guarda las horas extra
			salarioTotal = salarioBase + (horasExtra * 22); // Guarda el salario total

		}

		return salarioTotal; // Retornamos el salario total

	}

	static void mostrarResultado(int salarioTotal) { // Recuperamos el salario total del método calcularSalario y lo mostramos

		System.out.println("El salario total es: " + salarioTotal);

	}

	static String preguntaContinuar() { // Preguntamos si quiere finalizar el programa

		Scanner tecladoContinuar = new Scanner(System.in);
		String continuar = "";

		System.out.println("Para finalizar el programa introduce la letra E");
		continuar = tecladoContinuar.nextLine();

		if (continuar.equalsIgnoreCase("E")) { // Si introduce la letra e finaliza el programa

			System.out.println("Programa finalizado");
			
		}
		
		return continuar; // Retornamos la variable continuar

	}

}
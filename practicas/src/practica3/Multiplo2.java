// Multiplo2.java
// Fecha: 02/12/2020
// Autor: Alejandro Garay López
// Escribe en pantalla los múltiplos de 2 por debajo de un tope que pasamos por un parámetro.

public class Multiplo2 {
	public static void main(String argumentos[]) {

		mostrarMultiplos1(20);

	}

	static void mostrarMultiplos1(int tope) {

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
	
}
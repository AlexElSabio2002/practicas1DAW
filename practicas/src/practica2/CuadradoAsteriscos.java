/**
 * CuadradoAsteriscos.java
 * Programa que pide un número del 1 al 10 y crea un cuadrado de asteriscos con ese tamaño de lado en la consola
 * agl - 07.11.202
 */

import java.util.Scanner;

public class CuadradoAsteriscos {
	public static void main(String args[]) {

		// Método Scanner para solicitar datos en la consola
		Scanner teclado = new Scanner(System.in);

		// Solicitamos un número del 2 al 10
		System.out.println("Introduce un número del 2 al 10: ");
		int numeroLado = teclado.nextInt();
		int condicion = 0;

		while (condicion == 0) { // Si condicion es igual a 0

			if (numeroLado == 2) { // Si numeroLado es igual a 2

				System.out.println("          * *\n");
				System.out.println("          * *");
				condicion++;

			} else if (numeroLado == 3) { // Si numeroLado es igual a 3

				System.out.println("          * * *\n");
				System.out.println("          *   *\n");
				System.out.println("          * * *");
				condicion++;

			} else if (numeroLado == 4) { // Si numeroLado es igual a 4

				System.out.println("          * * * *\n");
				System.out.println("          *     *\n");
				System.out.println("          *     *\n");
				System.out.println("          * * * *");
				condicion++;

			} else if (numeroLado == 5) { // Si numeroLado es igual a 5

				System.out.println("           * * * * *\n");
				System.out.println("           *       *\n");
				System.out.println("           *       *\n");
				System.out.println("           *       *\n");
				System.out.println("           * * * * *");
				condicion++;

			} else if (numeroLado == 6) { // Si numeroLado es igual a 6

				System.out.println("           * * * * * *\n");
				System.out.println("           *         *\n");
				System.out.println("           *         *\n");
				System.out.println("           *         *\n");
				System.out.println("           *         *\n");
				System.out.println("           * * * * * *");
				condicion++;

			} else if (numeroLado == 7) { // Si numeroLado es igual a 7

				System.out.println("           * * * * * * *\n");
				System.out.println("           *           *\n");
				System.out.println("           *           *\n");
				System.out.println("           *           *\n");
				System.out.println("           *           *\n");
				System.out.println("           *           *\n");
				System.out.println("           * * * * * * *");
				condicion++;

			} else if (numeroLado == 8) { // Si numeroLado es igual a 8

				System.out.println("           * * * * * * * *\n");
				System.out.println("           *             *\n");
				System.out.println("           *             *\n");
				System.out.println("           *             *\n");
				System.out.println("           *             *\n");
				System.out.println("           *             *\n");
				System.out.println("           *             *\n");
				System.out.println("           * * * * * * * *");
				condicion++;

			} else if (numeroLado == 9) { // Si numeroLado es igual a 9

				System.out.println("           * * * * * * * * *\n");
				System.out.println("           *               *\n");
				System.out.println("           *               *\n");
				System.out.println("           *               *\n");
				System.out.println("           *               *\n");
				System.out.println("           *               *\n");
				System.out.println("           *               *\n");
				System.out.println("           *               *\n");
				System.out.println("           * * * * * * * * *");
				condicion++;

			} else if (numeroLado == 10) { // Si numeroLado es igual a 10

				System.out.println("            * * * * * * * * * *\n");
				System.out.println("            *                 *\n");
				System.out.println("            *                 *\n");
				System.out.println("            *                 *\n");
				System.out.println("            *                 *\n");
				System.out.println("            *                 *\n");
				System.out.println("            *                 *\n");
				System.out.println("            *                 *\n");
				System.out.println("            *                 *\n");
				System.out.println("            * * * * * * * * * *");
				condicion++;
			}
		}
	}
}

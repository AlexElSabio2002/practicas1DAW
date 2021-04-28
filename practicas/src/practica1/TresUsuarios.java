/**
 * Alejandro Garay López (1º DAW)
 * Programa que registra los nombres tres personas
 * y sus datos
**/
import java.util.Scanner;

public class TresUsuarios {
	public static void main(String [] args) {
		
		//Declaramos variables
		String nombre1, apellidos1, nif1, codPostal1;
		String nombre2, apellidos2, nif2, codPostal2;
		String nombre3, apellidos3, nif3, codPostal3;
		
		Scanner teclado = new Scanner(System.in);
		
		//Configuración Usuario 1
		System.out.println("**********\nUsuario 1\n**********");  //Mensaje en pantalla
		System.out.println("Nombre:");  //Mensaje en pantalla
		nombre1 = teclado.nextLine(); //Entrada por teclado
		System.out.println("Apellidos:");  //Mensaje en pantalla
		apellidos1 = teclado.nextLine(); //Entrada por teclado
		System.out.println("NIF:");  //Mensaje en pantalla
		nif1 = teclado.nextLine(); //Entrada por teclado
		System.out.println("Código Postal:");  //Mensaje en pantalla
		codPostal1 = teclado.nextLine(); //Entrada por teclado
		
		//Configuración Usuario 2
		System.out.println("**********\nUsuario 2\n**********");  //Mensaje en pantalla
		System.out.println("Nombre:");  //Mensaje en pantalla
		nombre2 = teclado.nextLine(); //Entrada por teclado
		System.out.println("Apellidos:");  //Mensaje en pantalla
		apellidos2 = teclado.nextLine(); //Entrada por teclado
		System.out.println("NIF:");  //Mensaje en pantalla
		nif2 = teclado.nextLine(); //Entrada por teclado
		System.out.println("Código Postal:");  //Mensaje en pantalla
		codPostal2 = teclado.nextLine(); //Entrada por teclado
		
		//Configuración Usuario 2
		System.out.println("**********\nUsuario 3\n**********");  //Mensaje en pantalla
		System.out.println("Nombre:");  //Mensaje en pantalla
		nombre3 = teclado.nextLine(); //Entrada por teclado
		System.out.println("Apellidos:");  //Mensaje en pantalla
		apellidos3 = teclado.nextLine(); //Entrada por teclado
		System.out.println("NIF:");  //Mensaje en pantalla
		nif3 = teclado.nextLine(); //Entrada por teclado
		System.out.println("Código Postal:");  //Mensaje en pantalla
		codPostal3 = teclado.nextLine(); //Entrada por teclado
		
		System.out.println("-----------------------------");  //Separamos el registro de datos de la impresión de datos
		//Mostramos los datos introducidos de los usuarios en orden inverso
		System.out.println("··········\nUsuario 3\n··········");  //Mensaje en pantalla
		System.out.println("Nombre: " + nombre3 + "\nApellidos: " + apellidos3 + "\nNIF: " + nif3 + "\nCódigo Postal: " + codPostal3);  //Mensaje en pantalla
		System.out.println("··········\nUsuario 2\n··········");  //Mensaje en pantalla
		System.out.println("Nombre: " + nombre2 + "\nApellidos: " + apellidos2 + "\nNIF: " + nif2 + "\nCódigo Postal: " + codPostal2);  //Mensaje en pantalla
		System.out.println("··········\nUsuario 1\n··········");  //Mensaje en pantalla
		System.out.println("Nombre: " + nombre1 + "\nApellidos: " + apellidos1 + "\nNIF: " + nif1 + "\nCódigo Postal: " + codPostal1);  //Mensaje en pantalla
		
	}
}

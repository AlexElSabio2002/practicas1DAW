/**
 * DatosPersonales.java
 * Programa que muestra los datos personales de una persona en la consola del sistema.
 * agl - 07.11.202
 */

public class DatosPersonales {
	public static void main(String args[]) {

		//Mostramos en pantalla los datos de la persona
		String nombreCompleto = "Alejandro Garay López"; //Variable de texto
		System.out.println("·Nombre completo: " + nombreCompleto + "\n");
		
		String pais = "España", ciudad = "Murcia";
		System.out.println("·País: " + pais + " | ·Ciudad: " + ciudad + "\n");
		
		String calle = "C/Vicente Medina", codigoPostal = "30560";
		System.out.println("·Calle: " + calle + " | ·Código Postal: " + codigoPostal);
		
		
	}
}
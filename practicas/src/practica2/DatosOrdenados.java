import java.util.Scanner;

public class DatosOrdenados {
	public static void main(String args[]) {

		// Método Scanner para solicitar datos en la consola
		Scanner teclado = new Scanner(System.in);

		// Declaramos 3 datos y las imprimimos en pantalla
		String dato1 = teclado.nextLine();
		String dato2 = teclado.nextLine();
		String dato3 = teclado.nextLine();
		
		System.out.println("Mensaje 1: " + dato1);
		System.out.println("Mensaje 1: " + dato2);
		System.out.println("Mensaje 1: " + dato3);

	}
}

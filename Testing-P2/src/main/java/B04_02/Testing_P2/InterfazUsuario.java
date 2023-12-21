package B04_02.Testing_P2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazUsuario {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado();
			
			double a = leerDouble("Ingrese el coeficiente a: ");
			double b = leerDouble("Ingrese el coeficiente b: ");
			double c = leerDouble("Ingrese el coeficiente c: ");
			

			double[] raices = ecuacion.calcularRaices(a, b, c);

			System.out.println("Las raices son:");
			for (double raiz : raices) {
				System.out.println(raiz);
			}
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static double leerDouble(String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);
				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.err.println("Error: Ingrese un valor numerico valido.");
				scanner.nextLine();
			}
		}
	}	
}
